package factory;

import composite.Country;
import composite.Panels;
import composite.Regions;
import composite.Sectors;

public class FactoryProduct {

    public FactoryProduct() {}

    public ProductsInterface makeProduct(String type) throws UndefinedProductException {
        ProductsInterface product;

        if(type.equals("panel")) product = new Panels();
        else if (type.equals("sector")) product = new Sectors();
        else if (type.equals("country")) product = new Country();
        else if (type.equals("region")) product = new Regions();
        else throw new UndefinedProductException();

        return product;
    }
}
