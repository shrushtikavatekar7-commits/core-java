class RythmsExecutor {

    public static void main(String[] args) {

        MusicInstrument m1 = new MusicInstrument(1,"Guitar","String");
        Rythms r1 = new Rythms(101,"Rock",m1);

        MusicInstrument m2 = new MusicInstrument(2,"Tabla","Percussion");
        Rythms r2 = new Rythms(102,"Classical",m2);

        r1.display();
        r2.display();
    }
}