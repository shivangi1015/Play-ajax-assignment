package controllers

import javax.inject._
import play.api.Logger
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import services.{UserInfo, UserOperation}


/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class signupController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def signup = Action {
    Ok(views.html.signup())
  }


  def addPerson(username: String,fname: String,lname: String,email: String,password: String,gender: String,dob: String)= Action { implicit request =>

    val userData = UserInfo(username,fname,lname,email,password,gender,dob)
    val users = services.UserOperation.getUsers
    val flag = users.map( x=> if(x.username == userData.username) true else false)
    if(flag.forall( _ == false)) {
      UserOperation.addUser(userData)
      Ok(views.html.Profile(userData))
    }
    else{
      Ok(views.html.main())

    }
    }

}
