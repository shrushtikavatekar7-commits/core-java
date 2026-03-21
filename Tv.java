class Tv {

    int id;
    String brand;
    Channel channel;   // HAS-A

    public Tv(int id, String brand, Channel channel) {
        this.id = id;
        this.brand = brand;
        this.channel = channel;
    }

    public void display() {
        System.out.println("TV: " + id + " " + brand);
        channel.display();
        System.out.println("-------------------");
    }
}