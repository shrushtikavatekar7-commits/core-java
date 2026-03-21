class LinkedIn {

    int id;
    String company;
    Profile profile;   // HAS-A

    public LinkedIn(int id, String company, Profile profile) {
        this.id = id;
        this.company = company;
        this.profile = profile;
    }

    public void display() {
        System.out.println("LinkedIn: " + id + " " + company);
        profile.display();
        System.out.println("-------------------");
    }
}