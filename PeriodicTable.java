class PeriodicTable {

    int id;
    String type;
    Element element;  

    public PeriodicTable(int id, String type, Element element) {
        this.id = id;
        this.type = type;
        this.element = element;
    }

    public void display() {
        System.out.println("PeriodicTable: " + id + " " + type);
        element.display();
        System.out.println("-------------------");
    }
}