class TourismAngadi {

    int id;
    String name;
    Package pack;   // HAS-A

    public TourismAngadi(int id, String name, Package pack) {
        this.id = id;
        this.name = name;
        this.pack = pack;
    }

    public void display() {
        System.out.println("TourismAngadi: " + id + " " + name);
        pack.display();
        System.out.println("-------------------");
    }
}