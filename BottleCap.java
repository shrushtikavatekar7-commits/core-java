class BottleCap {

    int id;
    String type;
    String material;
    String color;
    double price;
    double size;
    String shape;
    String brand;
    String country;
    boolean isLeakProof;
    boolean isReusable;
    boolean isAvailable;

  
    public BottleCap(int id, String type, String material, String color,
                     double price, double size, String shape,
                     String brand, String country,
                     boolean isLeakProof, boolean isReusable,
                     boolean isAvailable) {

        this.id = id;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.brand = brand;
        this.country = country;
        this.isLeakProof = isLeakProof;
        this.isReusable = isReusable;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("BottleCap Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Shape: " + shape);
        System.out.println("Brand: " + brand);
        System.out.println("Country: " + country);
        System.out.println("Leak Proof: " + isLeakProof);
        System.out.println("Reusable: " + isReusable);
        System.out.println("Available: " + isAvailable);
    }
}