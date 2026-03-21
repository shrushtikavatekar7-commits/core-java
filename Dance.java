class Dance {

    int id;
    String name;
    Form form;   

    public Dance(int id, String name, Form form) {
        this.id = id;
        this.name = name;
        this.form = form;
    }

    public void display() {
        System.out.println("Dance: " + id + " " + name);
        form.display();
        System.out.println("-------------------");
    }
}