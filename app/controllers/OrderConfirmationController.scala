package controllers

import javax.inject.Inject
import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

class OrderConfirmationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def displayPage() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.order_confirmation())
  }
}