class Museum {

    int id;
    String name;
    Diamond diamond;   

    public Museum(int id, String name, Diamond diamond) {
        this.id = id;
        this.name = name;
        this.diamond = diamond;
    }

    public void display() {
        System.out.println("Museum: " + id + " " + name);
        diamond.display();
        System.out.println("-------------------");
    }
}