package controllers;

import play.mvc.*;
import java.util.*;

public class RegisterController extends Controller {


    public Result register() {
        return ok(views.html.register.render());

    }

    public Result submitDetails(){
        // TODO: 27/07/2020
        return(ok("todo"));
    }
}