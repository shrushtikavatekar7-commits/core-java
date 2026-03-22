class LionDates {

    int id;
    String name;
    double price;
    String brand;
    String type;
    String expiry;
    String taste;
    String usage;
    String country;
    int quantity;
    String packaging;
    String batchNo;
    String quality;
    String category;
    String size;
    boolean fresh;
    double weight;
    String manufacturer;
    String grade;
    String nutrition;

    LionDates() {
        this(12);
    }

    LionDates(int id) {
        this(id, "LionDates");
    }

    LionDates(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}