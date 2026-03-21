class Office {

    int id;
    String name;
    String location;
    int employees;
    String manager;
    double revenue;
    String type;
    String department;
    String building;
    String city;
    String state;
    String country;
    int floors;
    double rating;
    String facility;
    String timing;
    String workType;
    String network;
    String security;
    String equipment;

    public Office(int id, String name, String location, int employees, String manager,
                  double revenue, String type, String department, String building,
                  String city, String state, String country, int floors,
                  double rating, String facility, String timing, String workType,
                  String network, String security, String equipment) {

        this.id = id;
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.manager = manager;
        this.revenue = revenue;
        this.type = type;
        this.department = department;
        this.building = building;
        this.city = city;
        this.state = state;
        this.country = country;
        this.floors = floors;
        this.rating = rating;
        this.facility = facility;
        this.timing = timing;
        this.workType = workType;
        this.network = network;
        this.security = security;
        this.equipment = equipment;
    }

    public void display() {
        System.out.println("Office: " + id + " " + name + " " + location);
    }
}