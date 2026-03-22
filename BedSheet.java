class BedSheet {

    int id;
    String name;
    double price;
    String material;
    String color;
    String sizeType;
    String usage;
    String country;
    int quantity;
    String brand;
    String packaging;
    String batchNo;
    String quality;
    String category;
    String size;
    boolean washable;
    double weight;
    String manufacturer;
    String design;
    String threadCount;

    BedSheet() {
        this(8);
    }

    BedSheet(int id) {
        this(id, "BedSheet");
    }

    BedSheet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}