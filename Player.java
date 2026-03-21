class Player {

    int id;
    String name;
    String role;

    public Player(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void display() {
        System.out.println("Player: " + id + " " + name + " " + role);
    }
}