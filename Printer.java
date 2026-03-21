class Printer {

    int id;
    String brand;
    String type;
    String color;
    double price;
    String printType;
    int speed;
    String connectivity;
    String paperSize;
    String country;
    boolean isWireless;
    boolean isAvailable;

    public Printer(int id, String brand, String type, String color,
                   double price, String printType, int speed,
                   String connectivity, String paperSize,
                   String country, boolean isWireless, boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.printType = printType;
        this.speed = speed;
        this.connectivity = connectivity;
        this.paperSize = paperSize;
        this.country = country;
        this.isWireless = isWireless;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Printer Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Print Type: " + printType);
        System.out.println("Speed: " + speed);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Paper Size: " + paperSize);
        System.out.println("Country: " + country);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Available: " + isAvailable);
    }
}