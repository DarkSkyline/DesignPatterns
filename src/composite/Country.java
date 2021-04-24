package composite;

import factory.ProductsInterface;
import java.util.ArrayList;

public class Country extends Localization {
    private ArrayList<Localization> localizations;
    private String pais;

    public Country() {
        localizations = new ArrayList<>();
    }

    public void addChild(Localization child) {
        this.localizations.add(child);
    }

    public void removeChild(Localization child) {
        this.localizations.remove(child);
    }

    public void getPais() { }

    public void setPais() { }
}
