package controllers

import play.api.mvc._

/**
  * Created by oliverslade on 17/08/17.
  */
class WelcomeController extends Controller {
  def index = Action { implicit request =>
    Ok(views.html.welcome())
  }
}
