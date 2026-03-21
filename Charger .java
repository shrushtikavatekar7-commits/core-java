class Charger {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int power;
    String connectorType;
    String compatibility;
    String cableLength;
    String country;
    boolean isFastCharging;
    boolean isAvailable;

    public Charger(int id, String brand, String type, String color,
                   double price, int power, String connectorType,
                   String compatibility, String cableLength,
                   String country, boolean isFastCharging,
                   boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.power = power;
        this.connectorType = connectorType;
        this.compatibility = compatibility;
        this.cableLength = cableLength;
        this.country = country;
        this.isFastCharging = isFastCharging;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Charger Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Power: " + power);
        System.out.println("Connector: " + connectorType);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Cable Length: " + cableLength);
        System.out.println("Country: " + country);
        System.out.println("Fast Charging: " + isFastCharging);
        System.out.println("Available: " + isAvailable);
    }
}