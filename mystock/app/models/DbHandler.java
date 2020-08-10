package models;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;

public class DbHandler {

    private static String ip = "localhost";

    //add user to db
    public static void addUser(User user){

        try (CqlSession session = CqlSession.builder().build()) {
            ResultSet rs = session.execute(String.format("INSERT into test.users (id,username,password) VALUES(uuid(),'%s','%s')",user.username,user.password));
        }
        catch(Exception e){
            
        }
        
    }
    //get pwd
    public static String getPassword(String username){
        try(CqlSession session = CqlSession.builder().build()){
            ResultSet rs = session.execute(String.format("SELECT password FROM test.users WHERE username='%s' ALLOW FILTERING",username));
            Row row = rs.one();
            return row.getString("password");
        }
        catch(Exception e){
            //user doesnt exist
            return null;
        }
    }
    
}