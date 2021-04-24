package composite;

import StatePanels.Memento;
import StatePanels.NotExistingSnapshotException;
import factory.ProductsInterface;

import javax.swing.plaf.synth.Region;
import java.util.ArrayList;

public class Sectors extends Regions implements ProductionComponent, ProductsInterface {
    ArrayList<Memento> sectorsSnapshot = new ArrayList<>();
    private ArrayList<ProductionComponent> production = new ArrayList<>();
    private ArrayList<Regions> regions = new ArrayList<>();
    private int nSetor;
    private String brand = null;

    public Sectors() { }

    public Double getProduction(){
        return null;
    }

    public void addChild(Regions child) {
        this.regions.add(child);
    }

    public void removeChild(Regions child) {
        this.regions.remove(child);
    }

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
