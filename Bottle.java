class Bottle {

    int id;
    String brand;
    String type;
    String material;
    String color;
    double capacity;
    double price;
    String shape;
    boolean isInsulated;
    String capType;
    String country;
    boolean isReusable;

  
    public Bottle(int id, String brand, String type, String material,
                  String color, double capacity, double price,
                  String shape, boolean isInsulated,
                  String capType, String country, boolean isReusable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
        this.shape = shape;
        this.isInsulated = isInsulated;
        this.capType = capType;
        this.country = country;
        this.isReusable = isReusable;
    }

    public void display() {
        System.out.println("Bottle Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity);
        System.out.println("Price: " + price);
        System.out.println("Shape: " + shape);
        System.out.println("Insulated: " + isInsulated);
        System.out.println("Cap Type: " + capType);
        System.out.println("Country: " + country);
        System.out.println("Reusable: " + isReusable);
    }
}