class Machine {

    int id;
    String name;
    String type;

    public Machine(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void display() {
        System.out.println("Machine: " + id + " " + name + " " + type);
    }
}