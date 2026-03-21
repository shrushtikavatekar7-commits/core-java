class Stand {

    int id;
    String type;
    String material;
    String color;
    double price;
    String brand;
    int height;
    int weight;
    boolean isAdjustable;
    String usage;
    String shape;
    String country;
    String supplier;
    double rating;
    String design;
    String finish;
    String durability;
    String capacity;
    String model;
    String warranty;

    public Stand(int id, String type, String material, String color, double price,
                 String brand, int height, int weight, boolean isAdjustable,
                 String usage, String shape, String country, String supplier,
                 double rating, String design, String finish, String durability,
                 String capacity, String model, String warranty) {

        this.id = id;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.height = height;
        this.weight = weight;
        this.isAdjustable = isAdjustable;
        this.usage = usage;
        this.shape = shape;
        this.country = country;
        this.supplier = supplier;
        this.rating = rating;
        this.design = design;
        this.finish = finish;
        this.durability = durability;
        this.capacity = capacity;
        this.model = model;
        this.warranty = warranty;
    }

    public void display() {
        System.out.println("Stand: " + id + " " + type + " " + price + " " + brand);
    }
}