class TheoBroma {

    int id;
    String name;
    double price;
    String brand;
    String type;
    String flavour;
    String expiry;
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
    String rating;
    String bakeryType;

    TheoBroma() {
        this(13);
    }

    TheoBroma(int id) {
        this(id, "TheoBroma");
    }

    TheoBroma(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}