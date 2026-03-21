class VVPuram {

    int id;
    String location;
    FoodStreet foodStreet;   // HAS-A

    public VVPuram(int id, String location, FoodStreet foodStreet) {
        this.id = id;
        this.location = location;
        this.foodStreet = foodStreet;
    }

    public void display() {
        System.out.println("VVPuram: " + id + " " + location);
        foodStreet.display();
        System.out.println("-------------------");
    }
}