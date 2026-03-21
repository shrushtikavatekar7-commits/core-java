class MuseumExecutor {

    public static void main(String[] args) {

        Diamond d1 = new Diamond(1,"Kohinoor",1000000);
        Museum m1 = new Museum(101,"National Museum",d1);

        Diamond d2 = new Diamond(2,"Blue Diamond",800000);
        Museum m2 = new Museum(102,"City Museum",d2);

        m1.display();
        m2.display();
    }
}