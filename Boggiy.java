class Boggiy {

    int id;
    String type;
    int seats;

    public Boggiy(int id, String type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
    }

    public void display() {
        System.out.println("Boggiy: " + id + " " + type + " " + seats);
    }
}