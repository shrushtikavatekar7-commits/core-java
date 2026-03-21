class TourismAngadiExecutor {

    public static void main(String[] args) {

        Package p1 = new Package(1,"Goa",15000);
        TourismAngadi t1 = new TourismAngadi(101,"TravelCo",p1);

        Package p2 = new Package(2,"Manali",20000);
        TourismAngadi t2 = new TourismAngadi(102,"HolidayTrips",p2);

        t1.display();
        t2.display();
    }
}