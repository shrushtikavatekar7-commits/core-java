class FoodStreetRunner2 {
    public static void main(String[] args) {

        Stall stall = new Stall();
        stall.items = 15;
        stall.name = "Dosa Stall";
        stall.price = 70;

        FoodStreet street = new FoodStreet(2, "City Street", null);

        street.stall = stall;
        street.getFoodStreetDetails();
    }
}