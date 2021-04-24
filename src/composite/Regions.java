package composite;

import factory.ProductsInterface;

import java.util.ArrayList;

public class Regions extends Parks implements ProductsInterface {
    private ArrayList<Parks> filhos = new ArrayList<>();
    private String nSetor;
    private String brand = null;

    public Regions() { }

    public void addFilho(Parks filho) { }

    public void removeFilho(Parks filho) { }

    public void getRegiao() { }

    public void setRegiao() { }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
