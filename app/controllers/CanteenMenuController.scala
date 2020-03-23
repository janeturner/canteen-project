package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class CanteenMenuController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def displayPage() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
