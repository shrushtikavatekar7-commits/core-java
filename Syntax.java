class Syntax {

    int id;
    String rule;
    String example;

    public Syntax(int id, String rule, String example) {
        this.id = id;
        this.rule = rule;
        this.example = example;
    }

    public void display() {
        System.out.println("Syntax: " + id + " " + rule + " " + example);
    }
}