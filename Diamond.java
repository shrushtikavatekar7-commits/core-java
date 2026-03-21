class Diamond {

    int id;
    String type;
    double price;

    public Diamond(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public void display() {
        System.out.println("Diamond: " + id + " " + type + " " + price);
    }
}