package models;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;

public class DbHandler {

    private static String ip = "localhost";

    public static void addUser(User user){

        try (CqlSession session = CqlSession.builder().build()) {
            ResultSet rs = session.execute(String.format("INSERT into test.users (id,username,password) VALUES(uuid(),%s,%s)",user.username,user.password));
        }
        catch(Exception e){

        }
        
    }
    
}