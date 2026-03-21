class Lotion {

    int id;
    String brand;
    String type;
    String skinType;
    double price;
    String quantity;
    String fragrance;
    boolean isOrganic;
    String color;
    String usage;
    String ingredients;
    String country;
    String supplier;
    double rating;
    String effect;
    String packaging;
    String size;
    String texture;
    String shelfLife;
    String warranty;

    public Lotion(int id, String brand, String type, String skinType, double price,
                  String quantity, String fragrance, boolean isOrganic, String color,
                  String usage, String ingredients, String country, String supplier,
                  double rating, String effect, String packaging, String size,
                  String texture, String shelfLife, String warranty) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.skinType = skinType;
        this.price = price;
        this.quantity = quantity;
        this.fragrance = fragrance;
        this.isOrganic = isOrganic;
        this.color = color;
        this.usage = usage;
        this.ingredients = ingredients;
        this.country = country;
        this.supplier = supplier;
        this.rating = rating;
        this.effect = effect;
        this.packaging = packaging;
        this.size = size;
        this.texture = texture;
        this.shelfLife = shelfLife;
        this.warranty = warranty;
    }

    public void display() {
        System.out.println("Lotion: " + id + " " + brand + " " + price);
    }
}