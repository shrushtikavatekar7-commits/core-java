class Company {

    int id;
    String name;
    Project project;   // HAS-A

    public Company(int id, String name, Project project) {
        this.id = id;
        this.name = name;
        this.project = project;
    }

    public void display() {
        System.out.println("Company: " + id + " " + name);
        project.display();
        System.out.println("-------------------");
    }
}