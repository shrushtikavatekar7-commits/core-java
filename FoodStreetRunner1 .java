class FoodStreetRunner1 {
    public static void main(String[] args) {

        Stall stall = new Stall();
        stall.items = 10;
        stall.name = "Chaat Stall";
        stall.price = 50;

        FoodStreet street = new FoodStreet(1, "MG Road Street", stall);
        street.getFoodStreetDetails();
    }
}