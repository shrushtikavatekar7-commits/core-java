class Shoes {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int size;
    String material;
    String gender;
    String soleType;
    String country;
    int warranty;
    boolean isAvailable;

    // Constructor
    public Shoes(int id, String brand, String type, String color,
                 double price, int size, String material,
                 String gender, String soleType, String country,
                 int warranty, boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.size = size;
        this.material = material;
        this.gender = gender;
        this.soleType = soleType;
        this.country = country;
        this.warranty = warranty;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Shoes Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Gender: " + gender);
        System.out.println("Sole Type: " + soleType);
        System.out.println("Country: " + country);
        System.out.println("Warranty: " + warranty);
        System.out.println("Available: " + isAvailable);
    }
}