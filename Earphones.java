class Earphones {

    int id;
    String brand;
    String type;
    String color;
    double price;
    String connectivity;
    String batteryLife;
    String soundType;
    String compatibility;
    String country;
    boolean isWireless;
    boolean isAvailable;

    public Earphones(int id, String brand, String type, String color,
                     double price, String connectivity,
                     String batteryLife, String soundType,
                     String compatibility, String country,
                     boolean isWireless, boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.connectivity = connectivity;
        this.batteryLife = batteryLife;
        this.soundType = soundType;
        this.compatibility = compatibility;
        this.country = country;
        this.isWireless = isWireless;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Earphones Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Sound Type: " + soundType);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Country: " + country);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Available: " + isAvailable);
    }
}