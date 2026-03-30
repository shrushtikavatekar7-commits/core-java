class MuseumExecutor {

    public static void main(String[] args) {

        Museum m = new Museum();

        m.addMonument("Taj Mahal");
        m.addMonument("Hampi");
        m.addMonument("Red Fort");

        m.getAllMonuments();

        m.updateMonument("Hampi", "Mysore Palace");

        m.getAllMonuments();

        m.deleteMonument("Taj Mahal");

        m.getAllMonuments();
    }
}