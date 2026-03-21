class Fan {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int speedLevels;
    int blades;
    double power;
    String material;
    String warranty;
    String country;
    boolean isRemoteControlled;

   
    public Fan(int id, String brand, String type, String color,
               double price, int speedLevels, int blades, double power,
               String material, String warranty, String country,
               boolean isRemoteControlled) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.speedLevels = speedLevels;
        this.blades = blades;
        this.power = power;
        this.material = material;
        this.warranty = warranty;
        this.country = country;
        this.isRemoteControlled = isRemoteControlled;
    }

    public void display() {
        System.out.println("Fan Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Speed Levels: " + speedLevels);
        System.out.println("Blades: " + blades);
        System.out.println("Power: " + power);
        System.out.println("Material: " + material);
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + country);
        System.out.println("Remote Controlled: " + isRemoteControlled);
    }
}