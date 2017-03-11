package controllers

import play.api.data
import play.api.mvc.{Action, Controller}
import play.api.routing.JavaScriptReverseRouter

/**
  * Created by knoldus on 9/3/17.
  */
class JavascriptRoute extends Controller {

  def javascriptRoutes = Action {implicit request =>

    Ok(
      JavaScriptReverseRouter("jsRoutes")(
//        routes.javascript.FrontController.front,
        routes.javascript.AjaxController.signin,
        routes.javascript.AjaxController.signup
//        routes.javascript.DetailController.detail
      )
    ).as("text/javascript")
  }
}