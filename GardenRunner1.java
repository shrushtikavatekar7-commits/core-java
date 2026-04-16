class GardenRunner1 {
    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.petals = 5;
        flower.color = "Red";
        flower.price = 10;

        Garden garden = new Garden(1, "Rose Garden", flower);
        garden.getGardenDetails();
    }
}