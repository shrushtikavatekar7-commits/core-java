class GardenRunner2 {
    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.petals = 8;
        flower.color = "Yellow";
        flower.price = 15;

        Garden garden = new Garden(2, "City Garden", null);

        garden.flower = flower;
        garden.getGardenDetails();
    }
}