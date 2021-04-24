package composite;

import factory.ProductsInterface;

import java.util.ArrayList;

public class Regions extends Country implements ProductsInterface {
    private ArrayList<Country> country = new ArrayList<>();
    private String nSetor;
    private String brand = null;

    public Regions() { }

    public void addChild(Country child) {
        this.country.add(child);
    }

    public void removeChild(Country child) {
        this.country.remove(child);
    }

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
