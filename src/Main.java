import StatePanels.Backup;
import StatePanels.NotExistingSnapshotException;
import singleton.Auth;
import singleton.ExistingUserException;
import singleton.UndefinedUserException;
import composite.ExistingPanelException;
import composite.Panels;

public class Main {

    public static void main(String[] args) throws UndefinedUserException, ExistingUserException, ExistingPanelException, NotExistingSnapshotException {
        // System of authentication
        // Design Pattern: Singleton
        Auth.getInstance().register("user", "password");

        if(!Auth.getInstance().login("user", "")){
            System.out.println("The user doesn't exists");
        }

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

        //TODO: Need save the data from the last 3 states of each panel
        // Design Pattern: Memento
        Panels panel = new Panels();
        Backup backup = new Backup(panel);
        backup.takeSnapshot();
        panel.addPanel("Panel 1");
        backup.takeSnapshot();
        panel.addPanel("Panel 2");
        System.out.println(panel.getPanelList().size());
        backup.restoreSnapshot(1);
        System.out.println(panel.getPanelList().size());

        //TODO: Each sector need have some more configurations
        // Design Pattern: Decorator

    }
}
