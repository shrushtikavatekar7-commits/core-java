class PowerBank {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int capacity;
    int outputPorts;
    String chargingType;
    String compatibility;
    String country;
    boolean isFastCharging;
    boolean isAvailable;

    public PowerBank(int id, String brand, String type, String color,
                     double price, int capacity, int outputPorts,
                     String chargingType, String compatibility,
                     String country, boolean isFastCharging,
                     boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
        this.outputPorts = outputPorts;
        this.chargingType = chargingType;
        this.compatibility = compatibility;
        this.country = country;
        this.isFastCharging = isFastCharging;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("PowerBank Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Ports: " + outputPorts);
        System.out.println("Charging Type: " + chargingType);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Country: " + country);
        System.out.println("Fast Charging: " + isFastCharging);
        System.out.println("Available: " + isAvailable);
    }
}