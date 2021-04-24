package composite;

import factory.ProductsInterface;
import java.util.ArrayList;

public class Country extends Regions implements ProductsInterface {
    private ArrayList<Regions> filhos = new ArrayList<>();
    private String pais;

    public Country() { }

    public void addFilho(Regions filho) { }

    public void removeFilho(Regions filho) { }

    public void getPais() { }

    public void setPais() { }
}
