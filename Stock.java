class Stock {

    int id;
    String name;
    double price;

    public Stock(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Stock: " + id + " " + name + " " + price);
    }
}