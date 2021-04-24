package composite;

public class main {

    // Save the daily production
    // -> sectors; parks; regions; countries;
    // Design Pattern: Composite
    public static void main(String[] args) {
        Localization local = new Localization();
        local.setLabel("Localization");

        Country country = new Country();
        country.setLabel("Portugal");
        country.addChild(local);

        Regions region = new Regions();
        region.setLabel("Portugal");
        region.addChild(country);

        Sectors sector = new Sectors();
        sector.setLabel("Sector 1");
        sector.addChild(region);

        Parks parks = new Parks();
        parks.setLabel("Park 1");
        parks.addChild(sector);
        System.out.println(parks.getLabel());

        Panels panels = new Panels();
        panels.setLabel("Panel 1");
        panels.addChild(parks);
        panels.setProduction(Math.random());
    }
}
