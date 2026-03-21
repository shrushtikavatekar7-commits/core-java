class FoodStreet {

    int id;
    String name;
    String famousFor;

    public FoodStreet(int id, String name, String famousFor) {
        this.id = id;
        this.name = name;
        this.famousFor = famousFor;
    }

    public void display() {
        System.out.println("FoodStreet: " + id + " " + name + " " + famousFor);
    }
}