class UniverseExecutor {

    public static void main(String[] args) {

        Earth e1 = new Earth(1,"Planet","Life Exists");
        Universe u1 = new Universe(101,"Milky Way",e1);

        Earth e2 = new Earth(2,"Planet","Habitable");
        Universe u2 = new Universe(102,"Galaxy",e2);

        u1.display();
        u2.display();
    }
}