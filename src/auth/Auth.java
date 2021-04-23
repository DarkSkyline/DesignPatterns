package auth;

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
        if (!users.containsKey(username))
            throw new UndefinedUserException();
        return users.get(username).equals(password);
    }

    public void register(String username, String password) throws ExistingUserException {
        if (!users.containsKey(username)) {
            throw new ExistingUserException();
        }
        users.put(username, password);
    }

   public void resetUsers() {
        users.clear();
    }
}
