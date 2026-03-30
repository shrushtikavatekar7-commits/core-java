class PetShopExecutor {

    public static void main(String[] args) {

        PetShop p = new PetShop();

        p.addAccessory("Leash");
        p.addAccessory("Bowl");
        p.addAccessory("Toy");

        p.getAllAccessories();

        p.updateAccessory("Bowl", "Food Bowl");

        p.getAllAccessories();

        p.deleteAccessory("Leash");

        p.getAllAccessories();
    }
}
