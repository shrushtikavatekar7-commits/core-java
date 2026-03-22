class PlasticPlate {

    int id;
    String name;
    double price;
    String material;
    String color;
    String shape;
    String usage;
    String country;
    int quantity;
    String brand;
    String packaging;
    String batchNo;
    String quality;
    String category;
    String size;
    boolean reusable;
    double weight;
    String manufacturer;
    String design;
    String durability;

    PlasticPlate() {
        this(11);
    }

    PlasticPlate(int id) {
        this(id, "PlasticPlate");
    }

    PlasticPlate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}