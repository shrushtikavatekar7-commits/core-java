class Monitor {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int size;
    String resolution;
    int refreshRate;
    String panelType;
    String country;
    boolean isCurved;
    boolean isAvailable;

    public Monitor(int id, String brand, String type, String color,
                   double price, int size, String resolution,
                   int refreshRate, String panelType,
                   String country, boolean isCurved, boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.size = size;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.panelType = panelType;
        this.country = country;
        this.isCurved = isCurved;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Monitor Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Resolution: " + resolution);
        System.out.println("Refresh Rate: " + refreshRate);
        System.out.println("Panel Type: " + panelType);
        System.out.println("Country: " + country);
        System.out.println("Curved: " + isCurved);
        System.out.println("Available: " + isAvailable);
    }
}