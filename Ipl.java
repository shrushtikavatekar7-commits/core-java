class Ipl {

    int id;
    String team;
    Player player;  

    public Ipl(int id, String team, Player player) {
        this.id = id;
        this.team = team;
        this.player = player;
    }

    public void display() {
        System.out.println("IPL: " + id + " " + team);
        player.display();
        System.out.println("-------------------");
    }
}