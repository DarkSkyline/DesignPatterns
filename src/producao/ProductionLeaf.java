package producao;

public class ProductionLeaf implements ProductionComponent{

    private double production;

    @Override
    public Double getProduction(){
        return this.production;
    }

    public void setProduction(double production){
        this.production = production;
    }
}
