class Form {

    int id;
    String type;
    String origin;

    public Form(int id, String type, String origin) {
        this.id = id;
        this.type = type;
        this.origin = origin;
    }

    public void display() {
        System.out.println("Form: " + id + " " + type + " " + origin);
    }
}