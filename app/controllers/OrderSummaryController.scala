package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class OrderSummaryController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def displayPage() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.order_summary())
  }
}
