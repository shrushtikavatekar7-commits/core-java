class Speaker {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int power;
    String connectivity;
    String batteryLife;
    String compatibility;
    String country;
    boolean isBluetooth;
    boolean isPortable;

    public Speaker(int id, String brand, String type, String color,
                   double price, int power, String connectivity,
                   String batteryLife, String compatibility,
                   String country, boolean isBluetooth,
                   boolean isPortable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.power = power;
        this.connectivity = connectivity;
        this.batteryLife = batteryLife;
        this.compatibility = compatibility;
        this.country = country;
        this.isBluetooth = isBluetooth;
        this.isPortable = isPortable;
    }

    public void display() {
        System.out.println("Speaker Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Power: " + power);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Country: " + country);
        System.out.println("Bluetooth: " + isBluetooth);
        System.out.println("Portable: " + isPortable);
    }
}