class Shop {

    int id;
    String name;
    String type;

    public Shop(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void display() {
        System.out.println("Shop: " + id + " " + name + " " + type);
    }
}