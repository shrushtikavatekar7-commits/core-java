class Router {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int speed;
    String frequency;
    int ports;
    String coverage;
    String country;
    boolean isWireless;
    boolean isDualBand;

    public Router(int id, String brand, String type, String color,
                  double price, int speed, String frequency,
                  int ports, String coverage, String country,
                  boolean isWireless, boolean isDualBand) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.frequency = frequency;
        this.ports = ports;
        this.coverage = coverage;
        this.country = country;
        this.isWireless = isWireless;
        this.isDualBand = isDualBand;
    }

    public void display() {
        System.out.println("Router Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Frequency: " + frequency);
        System.out.println("Ports: " + ports);
        System.out.println("Coverage: " + coverage);
        System.out.println("Country: " + country);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Dual Band: " + isDualBand);
    }
}