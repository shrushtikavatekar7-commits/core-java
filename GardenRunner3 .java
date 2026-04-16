class GardenRunner3 {
    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.petals = 6;
        flower.color = "Pink";
        flower.price = 12;

        Garden garden = new Garden(3, "Botanical Garden", null);

        boolean result = garden.saveFlower(flower);

        System.out.println("Saved: " + result);
        garden.getGardenDetails();
    }
}