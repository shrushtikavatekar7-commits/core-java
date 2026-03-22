class Sunscream {

    int id;
    String name;
    double price;
    String brand;
    String spf;
    String expiry;
    String skinType;
    String fragrance;
    String usage;
    String country;
    int quantity;
    String packaging;
    String batchNo;
    String ingredients;
    String effect;
    String category;
    String size;
    boolean available;
    double rating;
    String manufacturer;

    Sunscream() {
        this(7);
    }

    Sunscream(int id) {
        this(id, "Sunscream");
    }

    Sunscream(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}