class Policy {

    int id;
    String name;
    String type;

    public Policy(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void display() {
        System.out.println("Policy: " + id + " " + name + " " + type);
    }
}