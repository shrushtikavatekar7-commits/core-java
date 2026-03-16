class Cricket {

    String playerName;
    int age;
    String team;
    String role;
    int matches;
    int runs;
    int wickets;
    int catches;
    String battingStyle;
    String bowlingStyle;
    double strikeRate;
    double average;
    String country;
    int jerseyNumber;
    boolean isCaptain;
    boolean isWicketKeeper;
    int centuries;
    int halfCenturies;
    int bestScore;
    int debutYear;

    Cricket(){
        System.out.println("Default constructor invoked");
    }

    Cricket(String playerName,int age,String team,String role,int matches,int runs,
    int wickets,int catches,String battingStyle,String bowlingStyle,double strikeRate,
    double average,String country,int jerseyNumber,boolean isCaptain,boolean isWicketKeeper,
    int centuries,int halfCenturies,int bestScore,int debutYear){

        this.playerName = playerName;
        this.age = age;
        this.team = team;
        this.role = role;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.strikeRate = strikeRate;
        this.average = average;
        this.country = country;
        this.jerseyNumber = jerseyNumber;
        this.isCaptain = isCaptain;
        this.isWicketKeeper = isWicketKeeper;
        this.centuries = centuries;
        this.halfCenturies = halfCenturies;
        this.bestScore = bestScore;
        this.debutYear = debutYear;

        System.out.println("Cricket Parameterized Constructor Invoked");
    }
}