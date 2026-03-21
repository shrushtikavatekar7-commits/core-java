class Profile {

    int id;
    String name;
    String skill;

    public Profile(int id, String name, String skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }

    public void display() {
        System.out.println("Profile: " + id + " " + name + " " + skill);
    }
}