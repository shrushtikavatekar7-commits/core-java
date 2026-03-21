class Trophy {

    int id;
    String name;
    String material;
    String color;
    double price;
    String event;
    String size;
    String shape;
    String brand;
    int quantity;
    String engraving;
    String winner;
    String year;
    String country;
    double rating;
    String design;
    String finish;
    String durability;
    String category;
    String supplier;

    public Trophy(int id, String name, String material, String color, double price,
                  String event, String size, String shape, String brand, int quantity,
                  String engraving, String winner, String year, String country,
                  double rating, String design, String finish, String durability,
                  String category, String supplier) {

        this.id = id;
        this.name = name;
        this.material = material;
        this.color = color;
        this.price = price;
        this.event = event;
        this.size = size;
        this.shape = shape;
        this.brand = brand;
        this.quantity = quantity;
        this.engraving = engraving;
        this.winner = winner;
        this.year = year;
        this.country = country;
        this.rating = rating;
        this.design = design;
        this.finish = finish;
        this.durability = durability;
        this.category = category;
        this.supplier = supplier;
    }

    public void display() {
        System.out.println("Trophy: " + id + " " + name + " " + event + " " + price);
    }
}