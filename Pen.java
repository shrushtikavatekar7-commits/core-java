class Pen {

    int id;
    String brand;
    String type;
    String color;
    double price;
    String inkColor;
    String material;
    String tipType;
    double length;
    String country;
    boolean isRefillable;
    boolean isAvailable;

  
    public Pen(int id, String brand, String type, String color,
               double price, String inkColor, String material,
               String tipType, double length, String country,
               boolean isRefillable, boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.inkColor = inkColor;
        this.material = material;
        this.tipType = tipType;
        this.length = length;
        this.country = country;
        this.isRefillable = isRefillable;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Pen Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Ink Color: " + inkColor);
        System.out.println("Material: " + material);
        System.out.println("Tip Type: " + tipType);
        System.out.println("Length: " + length);
        System.out.println("Country: " + country);
        System.out.println("Refillable: " + isRefillable);
        System.out.println("Available: " + isAvailable);
    }
}