class CricBuzExecutor {

    public static void main(String[] args) {

        CricBuz cric = new CricBuz();

        cric.addTeam("RCB");
        cric.addTeam("MI");
        cric.addTeam("CSK");

        System.out.println("All Teams:");
        cric.getAllTeams();

        System.out.println("-----------");

        cric.updateTeam("MI", "KKR");

        System.out.println("After Update:");
        cric.getAllTeams();

        System.out.println("-----------");

        cric.deleteTeam("RCB");

        System.out.println("After Delete:");
        cric.getAllTeams();
    }
}