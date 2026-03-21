class Chair {

    int id;
    String type;
    String material;
    String color;
    double price;
    int legs;
    String brand;
    String shape;
    double weight;
    String country;
    boolean isAdjustable;
    boolean isAvailable;

   
    public Chair(int id, String type, String material, String color,
                 double price, int legs, String brand, String shape,
                 double weight, String country,
                 boolean isAdjustable, boolean isAvailable) {

        this.id = id;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.legs = legs;
        this.brand = brand;
        this.shape = shape;
        this.weight = weight;
        this.country = country;
        this.isAdjustable = isAdjustable;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Chair Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Legs: " + legs);
        System.out.println("Brand: " + brand);
        System.out.println("Shape: " + shape);
        System.out.println("Weight: " + weight);
        System.out.println("Country: " + country);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Available: " + isAvailable);
    }
}