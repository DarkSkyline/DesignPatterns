package composite;

import factory.ProductsInterface;

import java.util.ArrayList;

public class Parks extends Sectors implements ProductsInterface {
    private ArrayList<Sectors> filhos = new ArrayList<>();
    private String nomeParque;

    public Parks() { }

    public void addFilho(Sectors filho) { }

    public void removeFilho(Sectors filho) { }

    public void getNomeparque() { }

    public void setNomeparque() { }
}
