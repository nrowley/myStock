package controllers;

import play.mvc.*;
import play.api.data;
import java.util.*;

public class RegisterController extends Controller {
    @Inject
    FormFactory formFactory;

    public Result register() {
        Form<User> userForm = formFactory.form(User.class);
        return ok(views.html.register.render(userForm));

    }

    public Result submitDetails(){
        return TODO;
    }
}