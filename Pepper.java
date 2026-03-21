class Pepper {

    int id;
    String type;
    String color;
    double weight;
    double price;
    String origin;
    boolean isOrganic;
    String taste;
    String quality;
    String brand;
    int quantity;
    String packaging;
    String supplier;
    String exportCountry;
    double rating;
    String grade;
    String harvestSeason;
    String storageType;
    String usage;
    String shelfLife;

    public Pepper(int id, String type, String color, double weight, double price,
                  String origin, boolean isOrganic, String taste, String quality,
                  String brand, int quantity, String packaging, String supplier,
                  String exportCountry, double rating, String grade,
                  String harvestSeason, String storageType, String usage, String shelfLife) {

        this.id = id;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.origin = origin;
        this.isOrganic = isOrganic;
        this.taste = taste;
        this.quality = quality;
        this.brand = brand;
        this.quantity = quantity;
        this.packaging = packaging;
        this.supplier = supplier;
        this.exportCountry = exportCountry;
        this.rating = rating;
        this.grade = grade;
        this.harvestSeason = harvestSeason;
        this.storageType = storageType;
        this.usage = usage;
        this.shelfLife = shelfLife;
    }

    public void display() {
        System.out.println("----- Pepper Details -----");
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Origin: " + origin);
        System.out.println("Organic: " + isOrganic);
        System.out.println("Taste: " + taste);
        System.out.println("Brand: " + brand);
        System.out.println("Usage: " + usage);
        System.out.println("--------------------------");
    }
}