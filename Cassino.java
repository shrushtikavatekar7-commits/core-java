class Cassino {

    int id;
    String name;
    String location;

    public Cassino(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("Cassino: " + id + " " + name + " " + location);
    }
}