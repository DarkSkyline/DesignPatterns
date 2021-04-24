package composite;

import StatePanels.Memento;
import factory.ProductsInterface;

import java.util.HashMap;

public class Panels implements ProductionComponent, ProductsInterface {
    public HashMap<String, Boolean> panelList = new HashMap<>();
    private double production;
    private String brand = null;

    public Panels() { }

    public void addPanel(String panelName) throws ExistingPanelException {
        if(this.panelList.containsKey(panelName))
            throw new ExistingPanelException();
        System.out.println("Add a panel with the name: {" + panelName + "}");
        this.panelList.put(panelName,true);
    }

    public Memento backup() {
        return new Memento(this.panelList);
    }

    public HashMap<String, Boolean> getPanelList() {
        return this.panelList;
    }

    public void restore(Memento state) {
        this.panelList = state.getState();
        System.out.println("List has ben restored");
    }

    @Override
    public Double getProduction(){
        return this.production;
    }

    public void setProduction(double production){
        this.production = production;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
