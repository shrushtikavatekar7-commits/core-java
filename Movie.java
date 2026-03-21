class Movie {

    int id;
    String name;
    String genre;

    public Movie(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public void display() {
        System.out.println("Movie: " + id + " " + name + " " + genre);
    }
}