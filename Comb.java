class Comb {

    int id;
    String name;
    double price;
    String material;
    String color;
    String type;
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
    String manufacturer;
    String design;
    String teethType;

    
    Comb() {
        this(5);
        System.out.println("Default Constructor Called");
    }

  
    Comb(int id) {
        this(id, "Comb");
        System.out.println("1 Param Constructor Called");
    }

    
    Comb(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("2 Param Constructor Called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}