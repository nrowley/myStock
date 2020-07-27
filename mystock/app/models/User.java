package models;


public class User{
    public String username;
    public String password;
    public String email;

    public User(String username,String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;

    }

    private static Set<User> users;

    static{
        books = new HashSet<>();
        books.add(new User("nelson","smelson","2002@gmail.com"));
    }

    private static Set<Users> allUsers(){
        return users;
    }

    private static User findByUser(String username){
        for(User user: users){
            if(user.username == username){
                return user;
            }
        }
        return null;
    }

    private static void add(User user){
        users.add(user);
    }
}