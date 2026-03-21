class Rythms {

    int id;
    String style;
    MusicInstrument instrument;   // HAS-A

    public Rythms(int id, String style, MusicInstrument instrument) {
        this.id = id;
        this.style = style;
        this.instrument = instrument;
    }

    public void display() {
        System.out.println("Rythms: " + id + " " + style);
        instrument.display();
        System.out.println("-------------------");
    }
}