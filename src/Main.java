import auth.Auth;
import auth.ExistingUserException;
import auth.UndefinedUserException;

public class Main {

    public static void main(String[] args) throws UndefinedUserException, ExistingUserException {
        //TODO: System of authentication
        // Design Pattern: Singleton
        System.out.println("we will create an user: {user} : {password}");
        Auth.getInstance().register("user", "password");

        System.out.println("we will do a bad login");
        Auth.getInstance().login("user", "");

        System.out.println("we will proceed the login");
        Auth.getInstance().login("user", "password");

        //TODO: save the daily production
        // -> sectors; parks; regions; countries;
        // Design Pattern:

        //TODO: Calculate the rentability of energy by region.
        // Design Pattern: Bridge

        //TODO: Panels with the same characteristic
        // Design Pattern: ObjectPool

        //TODO: Need save the data from the last 3 states of each pannel
        // Design Pattern: Memento

        //TODO: Each sector need have some more configurations
        // Design Pattern:

        //TODO: Design the UML file.
    }
}
