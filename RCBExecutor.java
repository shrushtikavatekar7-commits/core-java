class RCBExecutor {

    public static void main(String[] args) {

        RCB rcb = new RCB();

        rcb.addPlayer("Virat");
        rcb.addPlayer("Faf");
        rcb.addPlayer("Maxwell");

        rcb.getAllPlayers();

        rcb.updatePlayer("Faf", "Green");

        rcb.getAllPlayers();

        rcb.deletePlayer("Virat");

        rcb.getAllPlayers();
    }
}