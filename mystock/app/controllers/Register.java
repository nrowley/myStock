package controllers;

import play.*;
import models.User;
import models.DbHandler;
import javax.inject.*;


public class Register extends Controller {

    @Inject FormFactory formFactory;

    public Result register() {
        
        return ok(views.html.register.render());

    }

    public Result submitDetails(Http.Request request){
        
 
        Form<User> userForm = formFactory.form(User.class).withDirectFieldAccess(true);
        User user = userForm.bindFromRequest(request).get();
        user.hashPassword(); //hash user password
        DbHandler.addUser(user); //add user to db
        return ok();
    }
}