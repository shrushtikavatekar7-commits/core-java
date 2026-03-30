class TravelAgencyExecutor {

    public static void main(String[] args) {

        TravelAgency t = new TravelAgency();

        t.addPlace("Goa");
        t.addPlace("Manali");
        t.addPlace("Ooty");

        t.getAllPlaces();

        t.updatePlace("Manali", "Kashmir");

        t.getAllPlaces();

        t.deletePlace("Goa");

        t.getAllPlaces();
    }
}