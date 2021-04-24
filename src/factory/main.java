package factory;

public class main {

    public static void main(String[] args) throws UndefinedProductException {
        FactoryProduct factory = new FactoryProduct();
        factory.makeProduct("panel");
        factory.makeProduct("panel");

        factory.makeProduct("sector");
        factory.makeProduct("sector");

        factory.makeProduct("region");
        factory.makeProduct("region");

    }
}
