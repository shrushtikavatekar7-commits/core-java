class PaperCups {

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
    boolean disposable;
    double weight;
    String manufacturer;
    String design;
    String coating;

    PaperCups() {
        this(9);
    }

    PaperCups(int id) {
        this(id, "PaperCups");
    }

    PaperCups(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}