class Cylinder {

    int id;
    String name;
    double price;
    String gasType;
    String color;
    double capacity;
    String usage;
    String country;
    int quantity;
    String brand;
    String packaging;
    String batchNo;
    String safety;
    String category;
    String size;
    boolean refillable;
    double weight;
    String manufacturer;
    String valveType;
    String certification;

    Cylinder() {
        this(6);
    }

    Cylinder(int id) {
        this(id, "Cylinder");
    }

    Cylinder(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}