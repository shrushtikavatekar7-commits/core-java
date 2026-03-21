class Train {

    int id;
    String name;
    String source;
    String destination;
    int coaches;
    int seats;
    String type;
    String departureTime;
    String arrivalTime;
    double fare;
    String driver;
    boolean isExpress;

   
    public Train(int id, String name, String source, String destination,
                 int coaches, int seats, String type,
                 String departureTime, String arrivalTime,
                 double fare, String driver, boolean isExpress) {

        this.id = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.coaches = coaches;
        this.seats = seats;
        this.type = type;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fare = fare;
        this.driver = driver;
        this.isExpress = isExpress;
    }

    public void display() {
        System.out.println("Train Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Coaches: " + coaches);
        System.out.println("Seats: " + seats);
        System.out.println("Type: " + type);
        System.out.println("Departure: " + departureTime);
        System.out.println("Arrival: " + arrivalTime);
        System.out.println("Fare: " + fare);
        System.out.println("Driver: " + driver);
        System.out.println("Express: " + isExpress);
    }
}