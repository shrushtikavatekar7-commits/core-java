class FoodStreetRunner3 {
    public static void main(String[] args) {

        Stall stall = new Stall();
        stall.items = 8;
        stall.name = "Juice Stall";
        stall.price = 40;

        FoodStreet street = new FoodStreet(3, "Night Street", null);

        boolean result = street.saveStall(stall);

        System.out.println("Saved: " + result);
        street.getFoodStreetDetails();
    }
}