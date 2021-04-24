package singleton;

import java.util.HashMap;

public class Auth {

    private static Auth instance;
    private HashMap<String, String> users = new HashMap<>();

    private Auth() {

    }

    public static Auth getInstance() {
        if (instance == null) {
            instance = new Auth();
        }
        return instance;
    }

    public Boolean login(String username, String password) throws UndefinedUserException {
        System.out.println("You try to login with user:{"+ username +"} and password: {"+ password +"}");
        if (!users.containsKey(username))
            throw new UndefinedUserException();
        return users.get(username).equals(password);
    }

    public void register(String username, String password) throws ExistingUserException {
        if (users.containsKey(username)) {
            throw new ExistingUserException();
        }
        System.out.println("we will create an user: {"+username+"} : {"+password+"}");
        users.put(username, password);
        System.out.println("User created successfully");
    }

   public void resetUsers() {
        users.clear();
    }
}
