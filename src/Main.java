import auth.Auth;
import auth.ExistingUserException;
import auth.UndefinedUserException;

public class Main {

    public static void main(String[] args) throws UndefinedUserException, ExistingUserException {
        // System of authentication
        // Design Pattern: Singleton
        System.out.println("we will create an user: {user} : {password}");
        Auth.getInstance().register("user", "password");

        System.out.println("we will do a bad login");
        if(!Auth.getInstance().login("user", "")){
            System.out.println("The user doesn't exists");
        }

        System.out.println("we will proceed the login");
        if(Auth.getInstance().login("user", "password")){
            System.out.println("You have logged successfully");
        }

        //TODO: save the daily production
        // -> sectors; parks; regions; countries;
        // Design Pattern: Composite

        //TODO: Calculate the rentability of energy by region.
        // Design Pattern: Bridge

        //TODO: Panels with the same characteristic
        // Design Pattern: Factory

        //TODO: Need save the data from the last 3 states of each pannel
        // Design Pattern: Memento

        //TODO: Each sector need have some more configurations
        // Design Pattern: Decorator

    }
}
