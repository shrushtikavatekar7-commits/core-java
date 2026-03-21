class Project {

    int id;
    String name;
    String domain;

    public Project(int id, String name, String domain) {
        this.id = id;
        this.name = name;
        this.domain = domain;
    }

    public void display() {
        System.out.println("Project: " + id + " " + name + " " + domain);
    }
}