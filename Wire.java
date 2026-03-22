class Wire {

    int id;
    String name;
    double price;
    String material;
    String color;
    double length;
    String usage;
    String country;
    int quantity;
    String brand;
    String packaging;
    String batchNo;
    String quality;
    String category;
    String size;
    boolean flexible;
    double weight;
    String type;
    String manufacturer;
    String grade;

    
    Wire() {
        this(3);
        System.out.println("Default Constructor Called");
    }

    
    Wire(int id) {
        this(id, "Wire");
        System.out.println("1 Param Constructor Called");
    }

   
    Wire(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("2 Param Constructor Called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}