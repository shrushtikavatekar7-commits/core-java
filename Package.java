class Package {

    int id;
    String place;
    double price;

    public Package(int id, String place, double price) {
        this.id = id;
        this.place = place;
        this.price = price;
    }

    public void display() {
        System.out.println("Package: " + id + " " + place + " " + price);
    }
}