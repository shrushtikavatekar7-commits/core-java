class ProgrammingLanguage {

    int id;
    String name;
    Syntax syntax;   // HAS-A

    public ProgrammingLanguage(int id, String name, Syntax syntax) {
        this.id = id;
        this.name = name;
        this.syntax = syntax;
    }

    public void display() {
        System.out.println("ProgrammingLanguage: " + id + " " + name);
        syntax.display();
        System.out.println("-------------------");
    }
}