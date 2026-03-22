class ComedyShow {

    int id;
    String name;
    double price;
    String host;
    String genre;
    String language;
    String duration;
    String platform;
    int episodes;
    String country;
    String schedule;
    String batchNo;
    String quality;
    String category;
    String ratingType;
    boolean trending;
    double rating;
    String producer;
    String channel;
    String audience;

    ComedyShow() {
        this(10);
    }

    ComedyShow(int id) {
        this(id, "ComedyShow");
    }

    ComedyShow(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}