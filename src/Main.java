import StatePanels.Backup;
import StatePanels.NotExistingSnapshotException;
import bridge.APIRequest;
import bridge.Calculation;
import factory.FactoryModules;
import factory.FactoryProduct;
import factory.ProductsInterface;
import factory.UndefinedProductException;
import singleton.Auth;
import singleton.ExistingUserException;
import singleton.UndefinedUserException;
import composite.ExistingPanelException;
import composite.Panels;

import javax.management.ServiceNotFoundException;

public class Main {

    public static void main(String[] args) throws UndefinedUserException, ExistingUserException, ExistingPanelException, NotExistingSnapshotException, ServiceNotFoundException, UndefinedProductException {
        // System of authentication
        // Design Pattern: Singleton
        Auth.getInstance().register("user", "password");

        if(!Auth.getInstance().login("user", "")){
            System.out.println("The user doesn't exists");
        }

        if(Auth.getInstance().login("user", "password")){
            System.out.println("You have logged successfully");
        }

        // Calculate the rentability of energy by region.
        // Design Pattern: Bridge
        APIRequest request = new APIRequest();
        String idService = request.addService(new Calculation());
        String idContent = request.setContent(idService, "12");
        String content = request.getContent(idService, idContent);

        System.out.println("ID Service: {"+ idService +"}");
        System.out.println("ID Content: {"+ idContent +"}");
        System.out.println("Content: {"+ content +"}");

        // Need save the data from the last 3 states of each panel
        // Actually save only the state from the Panel to a backup class (Memento Pattern)
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
