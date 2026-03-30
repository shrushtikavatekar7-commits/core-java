class SingerExecutor {

    public static void main(String[] args) {

        Singer s = new Singer();

        s.addSinger("Arijit");
        s.addSinger("Shreya");
        s.addSinger("Sonu");
        s.addSinger("Neha");
        s.addSinger("KK");
        s.addSinger("Lata");
        s.addSinger("Asha");
        s.addSinger("Udit");
        s.addSinger("Kumar");
        s.addSinger("Atif");

        s.getAllSingers();

        System.out.println("Index: " + s.searchSinger("KK"));

        s.updateSinger("KK", "Krishnakumar");

        s.getAllSingers();

        s.deleteSinger("Arijit");

        s.getAllSingers();
    }
}