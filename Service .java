class Service {

    int id;
    String name;
    double price;

    public Service(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Service: " + id + " " + name + " " + price);
    }
}