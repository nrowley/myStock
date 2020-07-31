package models;
import com.datastax.driver.core.*;


public class DbHandler {

    private static String ip = "127.0.0.1";
    private static String keyspace = "test";
    static Cluster cluster = null;

    public static String insertIntoDb(){

        try{

            cluster = Cluster.builder().addContactPoint(ip).build();
            Session session = cluster.connect(keyspace);
    
            ResultSet rs = session.execute("SELECT * FROM users");
            Row row = rs.one();

            return row.getString("username");
    
        }
        catch(Exception e){
            return e.toString();
        }
    }

    
}