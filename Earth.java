class Earth {

    int id;
    String type;
    String life;

    public Earth(int id, String type, String life) {
        this.id = id;
        this.type = type;
        this.life = life;
    }

    public void display() {
        System.out.println("Earth: " + id + " " + type + " " + life);
    }
}