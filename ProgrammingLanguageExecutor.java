class ProgrammingLanguageExecutor {

    public static void main(String[] args) {

        Syntax s1 = new Syntax(1,"Semicolon","int a=10;");
        ProgrammingLanguage p1 = new ProgrammingLanguage(101,"Java",s1);

        Syntax s2 = new Syntax(2,"Indentation","print('Hello')");
        ProgrammingLanguage p2 = new ProgrammingLanguage(102,"Python",s2);

        p1.display();
        p2.display();
    }
}