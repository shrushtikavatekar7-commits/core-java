class LensKart {

    int id;
    String brand;
    Frame frame;   

    public LensKart(int id, String brand, Frame frame) {
        this.id = id;
        this.brand = brand;
        this.frame = frame;
    }

    public void display() {
        System.out.println("LensKart: " + id + " " + brand);
        frame.display();
        System.out.println("-------------------");
    }
}