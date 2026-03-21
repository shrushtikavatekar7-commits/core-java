class Paper {

    int id;
    String type;
    String size;
    String color;
    double price;
    String brand;
    int quantity;
    String quality;
    boolean isRecycled;
    String usage;
    String thickness;
    String texture;
    String country;
    String supplier;
    double rating;
    String packaging;
    String finish;
    String gsm;
    String shape;
    String durability;

    public Paper(int id, String type, String size, String color, double price,
                 String brand, int quantity, String quality, boolean isRecycled,
                 String usage, String thickness, String texture, String country,
                 String supplier, double rating, String packaging, String finish,
                 String gsm, String shape, String durability) {

        this.id = id;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.quality = quality;
        this.isRecycled = isRecycled;
        this.usage = usage;
        this.thickness = thickness;
        this.texture = texture;
        this.country = country;
        this.supplier = supplier;
        this.rating = rating;
        this.packaging = packaging;
        this.finish = finish;
        this.gsm = gsm;
        this.shape = shape;
        this.durability = durability;
    }

    public void display() {
        System.out.println("Paper: " + id + " " + type + " " + size + " " + price);
    }
}