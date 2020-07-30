package controllers;

import play.*;
import play.data.*;
import javax.inject.*;
import play.mvc.*;
import java.util.*;

public class Register extends Controller {

    @Inject FormFactory formFactory;

    public Result register() {
        return ok(views.html.register.render());

    }

    public Result submitDetails(){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String username = requestData.get("username");
        return ok(username);
    }
}