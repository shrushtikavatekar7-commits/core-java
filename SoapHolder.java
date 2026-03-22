class SoapHolder {

    int id;
    String name;
    double price;
    String material;
    String color;
    String shape;
    String usage;
    String country;
    int quantity;
    String brand;
    String packaging;
    String batchNo;
    String quality;
    String category;
    String size;
    boolean durable;
    double weight;
    String type;
    String manufacturer;
    String design;

    
    SoapHolder() {
        this(4);
        System.out.println("Default Constructor Called");
    }

    
    SoapHolder(int id) {
        this(id, "SoapHolder");
        System.out.println("1 Param Constructor Called");
    }

   
    SoapHolder(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("2 Param Constructor Called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}