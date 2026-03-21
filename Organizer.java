class Organizer {

    int id;
    String type;
    String material;
    String color;
    double price;
    String brand;
    int capacity;
    String usage;
    String shape;
    String design;
    String country;
    String supplier;
    double rating;
    String durability;
    String size;
    String finish;
    String packaging;
    String model;
    String warranty;
    String category;

    public Organizer(int id, String type, String material, String color, double price,
                     String brand, int capacity, String usage, String shape,
                     String design, String country, String supplier, double rating,
                     String durability, String size, String finish, String packaging,
                     String model, String warranty, String category) {

        this.id = id;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.capacity = capacity;
        this.usage = usage;
        this.shape = shape;
        this.design = design;
        this.country = country;
        this.supplier = supplier;
        this.rating = rating;
        this.durability = durability;
        this.size = size;
        this.finish = finish;
        this.packaging = packaging;
        this.model = model;
        this.warranty = warranty;
        this.category = category;
    }

    public void display() {
        System.out.println("Organizer: " + id + " " + type + " " + price);
    }
}