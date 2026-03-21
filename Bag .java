class Bag {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int capacity;
    String material;
    String gender;
    boolean isWaterproof;
    String warranty;
    String country;
    boolean isAvailable;

   
    public Bag(int id, String brand, String type, String color,
               double price, int capacity, String material,
               String gender, boolean isWaterproof,
               String warranty, String country, boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
        this.material = material;
        this.gender = gender;
        this.isWaterproof = isWaterproof;
        this.warranty = warranty;
        this.country = country;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Bag Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Material: " + material);
        System.out.println("Gender: " + gender);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + country);
        System.out.println("Available: " + isAvailable);
    }
}