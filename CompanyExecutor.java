class CompanyExecutor {

    public static void main(String[] args) {

        Project p1 = new Project(1,"AI System","AI");
        Company c1 = new Company(101,"TechSoft",p1);

        Project p2 = new Project(2,"Web App","Development");
        Company c2 = new Company(102,"InfoTech",p2);

        c1.display();
        c2.display();
    }
}