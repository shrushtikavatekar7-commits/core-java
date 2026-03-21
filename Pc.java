class Pc {

    int id;
    String brand;
    Hardware hardware;   // HAS-A

    public Pc(int id, String brand, Hardware hardware) {
        this.id = id;
        this.brand = brand;
        this.hardware = hardware;
    }

    public void display() {
        System.out.println("PC: " + id + " " + brand);
        hardware.display();
        System.out.println("-------------------");
    }
}