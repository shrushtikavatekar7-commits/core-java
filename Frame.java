class Frame {

    int id;
    String type;
    String color;

    public Frame(int id, String type, String color) {
        this.id = id;
        this.type = type;
        this.color = color;
    }

    public void display() {
        System.out.println("Frame: " + id + " " + type + " " + color);
    }
}