class MedicalShop {

    int id;
    String name;
    String owner;
    String location;
    String license;
    String contact;
    String email;
    String timing;
    String type;
    int staff;
    String services;
    String batchNo;
    String category;
    String rating;
    boolean open;
    double revenue;
    String city;
    String state;
    String country;
    String pincode;

    MedicalShop() {
        this(14);
    }

    MedicalShop(int id) {
        this(id, "MedicalShop");
    }

    MedicalShop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}