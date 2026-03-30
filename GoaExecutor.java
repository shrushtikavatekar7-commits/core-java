class GoaExecutor {

    public static void main(String[] args) {

        Goa g = new Goa();

        g.addBeach("Baga");
        g.addBeach("Calangute");
        g.addBeach("Anjuna");

        g.getAllBeaches();

        g.updateBeach("Calangute", "Colva");

        g.getAllBeaches();

        g.deleteBeach("Baga");

        g.getAllBeaches();
    }
}