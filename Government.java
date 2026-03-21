class Government {

    int id;
    String country;
    Policy policy;   // HAS-A

    public Government(int id, String country, Policy policy) {
        this.id = id;
        this.country = country;
        this.policy = policy;
    }

    public void display() {
        System.out.println("Government: " + id + " " + country);
        policy.display();
        System.out.println("-------------------");
    }
}