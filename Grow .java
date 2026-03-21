class Grow {

    int id;
    String user;
    Stock stock;   // HAS-A

    public Groww(int id, String user, Stock stock) {
        this.id = id;
        this.user = user;
        this.stock = stock;
    }

    public void display() {
        System.out.println("Groww: " + id + " " + user);
        stock.display();
        System.out.println("-------------------");
    }
}