class DumbBell {

    int id;
    String brand;
    double weight;
    String material;
    String color;
    double price;
    String type;
    boolean adjustable;
    String usage;
    String shape;
    String gripType;
    String coating;
    String country;
    String supplier;
    double rating;
    String durability;
    String size;
    String design;
    String packaging;
    String warranty;

    public DumbBell(int id, String brand, double weight, String material, String color,
                    double price, String type, boolean adjustable, String usage,
                    String shape, String gripType, String coating, String country,
                    String supplier, double rating, String durability, String size,
                    String design, String packaging, String warranty) {

        this.id = id;
        this.brand = brand;
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.price = price;
        this.type = type;
        this.adjustable = adjustable;
        this.usage = usage;
        this.shape = shape;
        this.gripType = gripType;
        this.coating = coating;
        this.country = country;
        this.supplier = supplier;
        this.rating = rating;
        this.durability = durability;
        this.size = size;
        this.design = design;
        this.packaging = packaging;
        this.warranty = warranty;
    }

    public void display() {
        System.out.println("DumbBell: " + id + " " + brand + " " + weight + "kg " + price);
    }
}