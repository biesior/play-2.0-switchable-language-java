package controllers;

import models.Coffee;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {

        Form<Coffee> coffeeForm = form(Coffee.class);
        return ok(index.render(coffeeForm));
    }

    public static Result submit(){
        Form<Coffee> coffeeForm = form(Coffee.class).bindFromRequest();

        if (coffeeForm.hasErrors()){
            return badRequest(index.render(coffeeForm));
        }

        return ok("it was saved...");
    }

}