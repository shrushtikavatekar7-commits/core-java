class Salon {

    int id;
    String name;
    Service service;   // HAS-A

    public Salon(int id, String name, Service service) {
        this.id = id;
        this.name = name;
        this.service = service;
    }

    public void display() {
        System.out.println("Salon: " + id + " " + name);
        service.display();
        System.out.println("-------------------");
    }
}