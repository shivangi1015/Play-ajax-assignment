package controllers

import javax.inject._

import play.api.Logger
import play.api.data.Forms._
import play.api.data._

import play.api.mvc._
import services.{LoginData, UserOperation, UserInfo}


/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class LoginController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def login = Action {
    Ok(views.html.welcome())
  }


  val users = UserOperation.getUsers


  def showProfile(name:String) = Action {implicit request =>
    val result = users.flatMap(user=>if(user.username == name) Some(user) else None)
    Ok(views.html.Profile(result.toList.head))
  }


  def processForm(username: String)= Action{ implicit request =>

    val userData = services.UserOperation.getUsers


        val flag = users.map(x => if(x.username == username) true else false)
        if(flag.contains(true)){

          Redirect(routes.LoginController.showProfile(username))
        }
        else
          Redirect(routes.HomeController.index())



  }








}
