class Franchisie {

    int id;
    String name;
    String country;

    public Franchisie(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public void display() {
        System.out.println("Franchisie: " + id + " " + name + " " + country);
    }
}