class Map {

    int id;
    String type;
    String country;
    String scale;
    double price;
    String publisher;
    int year;
    String language;
    String size;
    boolean laminated;
    String usage;
    String color;
    String material;
    String projection;
    double rating;
    String region;
    String theme;
    String supplier;
    String foldingType;
    String durability;

    public Map(int id, String type, String country, String scale, double price,
               String publisher, int year, String language, String size,
               boolean laminated, String usage, String color, String material,
               String projection, double rating, String region, String theme,
               String supplier, String foldingType, String durability) {

        this.id = id;
        this.type = type;
        this.country = country;
        this.scale = scale;
        this.price = price;
        this.publisher = publisher;
        this.year = year;
        this.language = language;
        this.size = size;
        this.laminated = laminated;
        this.usage = usage;
        this.color = color;
        this.material = material;
        this.projection = projection;
        this.rating = rating;
        this.region = region;
        this.theme = theme;
        this.supplier = supplier;
        this.foldingType = foldingType;
        this.durability = durability;
    }

    public void display() {
        System.out.println("Map: " + id + " " + type + " " + country + " " + price);
    }
}