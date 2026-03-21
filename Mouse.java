class Mouse {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int dpi;
    String connectivity;
    int buttons;
    String compatibility;
    String country;
    boolean isWireless;
    boolean isAvailable;

    public Mouse(int id, String brand, String type, String color,
                 double price, int dpi, String connectivity,
                 int buttons, String compatibility, String country,
                 boolean isWireless, boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.dpi = dpi;
        this.connectivity = connectivity;
        this.buttons = buttons;
        this.compatibility = compatibility;
        this.country = country;
        this.isWireless = isWireless;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Mouse Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("DPI: " + dpi);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Buttons: " + buttons);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Country: " + country);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Available: " + isAvailable);
    }
}