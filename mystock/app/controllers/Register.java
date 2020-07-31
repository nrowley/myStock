package controllers;

import play.*;
import models.User;
import play.data.*;
import javax.inject.*;
import play.mvc.*;
import java.*;

public class Register extends Controller {

    @Inject FormFactory formFactory;

    public Result register() {
        
        return ok(views.html.register.render());

    }

    public Result submitDetails(Http.Request request){
        
        /*
        DynamicForm requestData = formFactory.form().bindFromRequest(request);
        String username = requestData.get("username");
        String email = requestData.get("email");
        */
        
        Form<User> userForm = formFactory.form(User.class).withDirectFieldAccess(true);
        User user = userForm.bindFromRequest(request).get();
        return ok("Hello" + user.getUsername());
    }
}