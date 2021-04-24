package composite;

import factory.ProductsInterface;

import java.util.ArrayList;

public class Parks extends Sectors implements ProductsInterface {
    private ArrayList<Sectors> sectors = new ArrayList<>();
    private String nomeParque;

    public Parks() { }

    public void addChild(Sectors child) {
        this.sectors.add(child);
    }

    public void removeChild(Sectors child) {
        this.sectors.remove(child);
    }

    public void getNomeparque() { }

    public void setNomeparque() { }
}
