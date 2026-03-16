class CricketExecutor {

    public static void main(String[] args) {

        System.out.println("Before Execution");

        Cricket ref1 = new Cricket("Virat",35,"RCB","Batsman",250,12000,5,120,"Right","Right",135.5,52.3,"India",18,true,false,40,70,183,2008);
        System.out.println(ref1);

        Cricket ref2 = new Cricket("Rohit",36,"MI","Batsman",260,11000,8,110,"Right","Right",132.2,48.5,"India",45,true,false,30,65,209,2007);
        System.out.println(ref2);

        Cricket ref3 = new Cricket("Dhoni",42,"CSK","WicketKeeper",300,10500,1,150,"Right","Right",126.3,50.1,"India",7,true,true,10,70,183,2004);
        System.out.println(ref3);

        Cricket ref4 = new Cricket("Smith",34,"RR","Batsman",200,8000,2,90,"Right","Right",128.4,44.5,"Australia",49,false,false,25,40,164,2010);
        System.out.println(ref4);

        Cricket ref5 = new Cricket("Root",33,"ENG","Batsman",210,9000,3,95,"Right","Right",130.2,46.1,"England",66,false,false,20,45,180,2012);
        System.out.println(ref5);

    }
}