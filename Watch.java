class Watch {

    int id;
    String brand;
    String model;
    double price;
    String type;
    String color;
    String material;
    boolean isWaterproof;
    String warranty;
    String displayType;
    String country;
    boolean isSmart;

   
    public Watch(int id, String brand, String model, double price,
                 String type, String color, String material,
                 boolean isWaterproof, String warranty,
                 String displayType, String country, boolean isSmart) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.color = color;
        this.material = material;
        this.isWaterproof = isWaterproof;
        this.warranty = warranty;
        this.displayType = displayType;
        this.country = country;
        this.isSmart = isSmart;
    }

    public void display() {
        System.out.println("Watch Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Warranty: " + warranty);
        System.out.println("Display Type: " + displayType);
        System.out.println("Country: " + country);
        System.out.println("Smart Watch: " + isSmart);
    }
}