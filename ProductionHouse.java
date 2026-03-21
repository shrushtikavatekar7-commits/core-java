class ProductionHouse {

    int id;
    String name;
    Movie movie;   // HAS-A

    public ProductionHouse(int id, String name, Movie movie) {
        this.id = id;
        this.name = name;
        this.movie = movie;
    }

    public void display() {
        System.out.println("ProductionHouse: " + id + " " + name);
        movie.display();
        System.out.println("-------------------");
    }
}