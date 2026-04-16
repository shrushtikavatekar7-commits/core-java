class Garden {

    int gardenId;
    String gardenName;
    Flower flower;

    Garden(int gardenId, String gardenName, Flower flower) {
        this.gardenId = gardenId;
        this.gardenName = gardenName;
        this.flower = flower;
    }

    public boolean saveFlower(Flower flower) {

        System.out.println("Parameter flower: " + flower);
        System.out.println("Instance flower: " + this.flower);

        boolean isSaved = false;

        boolean isPetalsValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;

        if (flower != null) {

            if (flower.petals > 0) {
                isPetalsValid = true;
            }

            if (flower.color != null && !flower.color.isEmpty()) {
                isColorValid = true;
            }

            if (flower.price > 0) {
                isPriceValid = true;
            }

            if (isPetalsValid && isColorValid && isPriceValid) {
                this.flower = flower;
                isSaved = true;
            }
        }

        return isSaved;
    }

    public void getGardenDetails() {
        System.out.println("Garden ID: " + this.gardenId);
        System.out.println("Garden Name: " + this.gardenName);

        System.out.println("Flower Petals: " + this.flower.petals);
        System.out.println("Flower Color: " + this.flower.color);
        System.out.println("Flower Price: " + this.flower.price);
    }
}