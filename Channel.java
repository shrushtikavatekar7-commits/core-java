class Channel {

    int id;
    String name;
    String type;

    public Channel(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void display() {
        System.out.println("Channel: " + id + " " + name + " " + type);
    }
}