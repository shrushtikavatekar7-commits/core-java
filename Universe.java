class Universe {

    int id;
    String name;
    Earth earth;   // HAS-A

    public Universe(int id, String name, Earth earth) {
        this.id = id;
        this.name = name;
        this.earth = earth;
    }

    public void display() {
        System.out.println("Universe: " + id + " " + name);
        earth.display();
        System.out.println("-------------------");
    }
}