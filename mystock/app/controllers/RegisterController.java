package controllers;

import play.mvc.*;

public class RegisterController extends Controller {
    public Result register() {return ok(views.html.register.render());}

    public Result submitDetails() {
        final Map<String,String[]> form_values = request().body().asFormUrlEncoded();
        return(ok(form_values.get("username")[0]));
    }
}