class ElectricalShopExecutor {

    public static void main(String[] args) {

        ElectricalShop shop = new ElectricalShop();

        shop.addAppliance("Fan");
        shop.addAppliance("AC");
        shop.addAppliance("Refrigerator");

        System.out.println("All Appliances:");
        shop.getAllAppliances();

        System.out.println("-----------");

        shop.updateAppliance("AC", "Air Conditioner");

        System.out.println("After Update:");
        shop.getAllAppliances();

        System.out.println("-----------");

        shop.deleteAppliance("Fan");

        System.out.println("After Delete:");
        shop.getAllAppliances();
    }
}