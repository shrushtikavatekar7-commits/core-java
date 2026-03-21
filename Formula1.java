class Formula1 {

    int raceId;
    String raceName;
    Franchisie franchisie;   // HAS-A

    public Formula1(int raceId, String raceName, Franchisie franchisie) {
        this.raceId = raceId;
        this.raceName = raceName;
        this.franchisie = franchisie;
    }

    public void display() {
        System.out.println("Formula1: " + raceId + " " + raceName);
        franchisie.display();
        System.out.println("----------------------");
    }
}