package composite;

import StatePanels.Memento;
import StatePanels.NotExistingSnapshotException;
import factory.ProductsInterface;

import java.util.ArrayList;

public class Sectors implements ProductionComponent, ProductsInterface {
    ArrayList<Memento> sectorsSnapshot = new ArrayList<>();
    private ArrayList<ProductionComponent> production = new ArrayList<>();
    private int nSetor;
    private String brand = null;

    public Sectors() { }

    public Double getProduction(){
        return null;
    }
    public void addFilho(ProductionComponent filho) { }

    public void removeFilho(ProductionComponent filho) { }

    public void getnSetor() { }

    public void setnSetor() { }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
