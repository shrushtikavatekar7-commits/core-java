class TV {

    int id;
    String brand;
    String model;
    double price;
    int screenSize;
    String displayType;
    String resolution;
    String soundType;
    int warranty;
    String color;
    String country;
    boolean isSmartTV;

   
    public TV(int id, String brand, String model, double price,
              int screenSize, String displayType, String resolution,
              String soundType, int warranty, String color,
              String country, boolean isSmartTV) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
        this.displayType = displayType;
        this.resolution = resolution;
        this.soundType = soundType;
        this.warranty = warranty;
        this.color = color;
        this.country = country;
        this.isSmartTV = isSmartTV;
    }

    public void display() {
        System.out.println("TV Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Display Type: " + displayType);
        System.out.println("Resolution: " + resolution);
        System.out.println("Sound Type: " + soundType);
        System.out.println("Warranty: " + warranty);
        System.out.println("Color: " + color);
        System.out.println("Country: " + country);
        System.out.println("Smart TV: " + isSmartTV);
    }
}