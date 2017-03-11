package controllers

import com.google.inject.Inject
import play.api.mvc.{Action, Controller}

/**
  * Created by knoldus on 11/3/17.
  */
class AjaxController @Inject() extends Controller{


  def signin = Action { implicit request =>
    Ok(views.html.welcome())
  }

  def signup = Action { implicit request =>
    Ok(views.html.signup())
  }

}
