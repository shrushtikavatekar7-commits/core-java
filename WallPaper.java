class WallPaper {

    int id;
    String brand;
    String color;
    String type;
    double price;
    String size;
    boolean waterproof;
    String material;
    String design;
    String texture;
    String roomType;
    String country;
    int stock;
    double rating;
    String supplier;
    String pattern;
    boolean washable;
    String finish;
    String durability;
    String usage;

    public WallPaper(int id, String brand, String color, String type, double price,
                     String size, boolean waterproof, String material, String design,
                     String texture, String roomType, String country, int stock,
                     double rating, String supplier, String pattern, boolean washable,
                     String finish, String durability, String usage) {

        this.id = id;
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.size = size;
        this.waterproof = waterproof;
        this.material = material;
        this.design = design;
        this.texture = texture;
        this.roomType = roomType;
        this.country = country;
        this.stock = stock;
        this.rating = rating;
        this.supplier = supplier;
        this.pattern = pattern;
        this.washable = washable;
        this.finish = finish;
        this.durability = durability;
        this.usage = usage;
    }

    public void display() {
        System.out.println("----- WallPaper Details -----");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Material: " + material);
        System.out.println("Design: " + design);
        System.out.println("Texture: " + texture);
        System.out.println("Room Type: " + roomType);
        System.out.println("Country: " + country);
        System.out.println("Stock: " + stock);
        System.out.println("Rating: " + rating);
        System.out.println("Supplier: " + supplier);
        System.out.println("Pattern: " + pattern);
        System.out.println("Washable: " + washable);
        System.out.println("Finish: " + finish);
        System.out.println("Durability: " + durability);
        System.out.println("Usage: " + usage);
        System.out.println("------------------------------");
    }
}