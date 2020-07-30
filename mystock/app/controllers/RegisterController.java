package controllers;

import play.data.*;
import javax.inject.*;
import play.mvc.*;
import java.util.*;

public class RegisterController extends Controller {

    @Inject FormFactory formFactory;

    public Result register() {
        return ok(views.html.register.render());

    }

    public Result submitDetails(Http.Request request){
        DynamicForm requestData = formFactory.form().bindFromRequest(request);
        return ok(requestData.get("username"));
    }
}