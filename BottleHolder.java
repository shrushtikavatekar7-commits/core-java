class BottleHolder {

    int id;
    String material;
    String color;
    double price;
    int capacity;
    String brand;
    String type;
    double weight;
    String shape;
    String country;
    boolean isPortable;
    boolean isAvailable;

    public BottleHolder(int id, String material, String color, double price,
                        int capacity, String brand, String type,
                        double weight, String shape, String country,
                        boolean isPortable, boolean isAvailable) {

        this.id = id;
        this.material = material;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.shape = shape;
        this.country = country;
        this.isPortable = isPortable;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("BottleHolder Details:");
        System.out.println("ID: " + id);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Country: " + country);
        System.out.println("Portable: " + isPortable);
        System.out.println("Available: " + isAvailable);
    }
}