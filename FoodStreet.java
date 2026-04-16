class FoodStreet {

    int streetId;
    String streetName;
    Stall stall;

    FoodStreet(int streetId, String streetName, Stall stall) {
        this.streetId = streetId;
        this.streetName = streetName;
        this.stall = stall;
    }

    public boolean saveStall(Stall stall) {

        System.out.println("Parameter stall: " + stall);
        System.out.println("Instance stall: " + this.stall);

        boolean isSaved = false;

        boolean isItemsValid = false;
        boolean isNameValid = false;
        boolean isPriceValid = false;

        if (stall != null) {

            if (stall.items > 0) {
                isItemsValid = true;
            }

            if (stall.name != null && !stall.name.isEmpty()) {
                isNameValid = true;
            }

            if (stall.price > 0) {
                isPriceValid = true;
            }

            if (isItemsValid && isNameValid && isPriceValid) {
                this.stall = stall;
                isSaved = true;
            }
        }

        return isSaved;
    }

    public void getFoodStreetDetails() {
        System.out.println("Street ID: " + this.streetId);
        System.out.println("Street Name: " + this.streetName);

        System.out.println("Stall Items: " + this.stall.items);
        System.out.println("Stall Name: " + this.stall.name);
        System.out.println("Stall Price: " + this.stall.price);
    }
}