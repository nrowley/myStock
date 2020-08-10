package controllers;

import play.mvc.*;
import play.*;
import play.data.*;
import models.DbHandler;
import models.User;
import javax.inject.*;

public class LoginController extends Controller {


    @Inject FormFactory formFactory;

    public Result index() {
        return ok(views.html.login.render());
    }


    public Result login(Http.Request request){
        Form<User> loginForm = formFactory.form(User.class).withDirectFieldAccess(true);
        User user = loginForm.bindFromRequest(request).get();

        //check plain pwd with corresponding username in db
        if(user.checkPwd()){
            //show main page
            return ok(views.html.index.render());
        }
        else{
            //change html page to show the error message.
            return ok("incorrect login");
        }

    }

    public Result reset() { 
        return ok("reset pword");
    }

}
