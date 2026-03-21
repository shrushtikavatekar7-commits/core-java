class PVR {

    int id;
    String location;
    int screens;
    String movie;
    double ticketPrice;
    String timing;
    String seatType;
    boolean isIMAX;
    String food;
    String city;
    String state;
    String country;
    int capacity;
    double rating;
    String manager;
    String soundSystem;
    String screenType;
    String bookingMode;
    String language;
    String facility;

    public PVR(int id, String location, int screens, String movie, double ticketPrice,
               String timing, String seatType, boolean isIMAX, String food,
               String city, String state, String country, int capacity,
               double rating, String manager, String soundSystem,
               String screenType, String bookingMode, String language, String facility) {

        this.id = id;
        this.location = location;
        this.screens = screens;
        this.movie = movie;
        this.ticketPrice = ticketPrice;
        this.timing = timing;
        this.seatType = seatType;
        this.isIMAX = isIMAX;
        this.food = food;
        this.city = city;
        this.state = state;
        this.country = country;
        this.capacity = capacity;
        this.rating = rating;
        this.manager = manager;
        this.soundSystem = soundSystem;
        this.screenType = screenType;
        this.bookingMode = bookingMode;
        this.language = language;
        this.facility = facility;
    }

    public void display() {
        System.out.println("PVR: " + id + " " + location + " " + movie + " " + ticketPrice);
    }
}