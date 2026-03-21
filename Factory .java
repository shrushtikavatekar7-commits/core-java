class Factory {

    int id;
    String name;
    Machine machine;   

    public Factory(int id, String name, Machine machine) {
        this.id = id;
        this.name = name;
        this.machine = machine;
    }

    public void display() {
        System.out.println("Factory: " + id + " " + name);
        machine.display();
        System.out.println("-------------------");
    }
}