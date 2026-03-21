class Laptop {

    int id;
    String brand;
    String model;
    double price;
    int ram;
    int storage;
    String processor;
    double screenSize;
    String os;
    String color;
    int warranty;
    boolean isSSD;

   
    public Laptop(int id, String brand, String model, double price,
                  int ram, int storage, String processor,
                  double screenSize, String os, String color,
                  int warranty, boolean isSSD) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.screenSize = screenSize;
        this.os = os;
        this.color = color;
        this.warranty = warranty;
        this.isSSD = isSSD;
    }

    public void display() {
        System.out.println("Laptop Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Processor: " + processor);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Operating System: " + os);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty);
        System.out.println("SSD: " + isSSD);
    }
}