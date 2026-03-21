class Hardware {

    int id;
    String name;
    String type;

    public Hardware(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void display() {
        System.out.println("Hardware: " + id + " " + name + " " + type);
    }
}