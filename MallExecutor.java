class MallExecutor {

    public static void main(String[] args) {

        Shop s1 = new Shop(1,"Zudio","Clothing");
        Mall m1 = new Mall(101,"Orion Mall",s1);

        Shop s2 = new Shop(2,"Reliance","Supermarket");
        Mall m2 = new Mall(102,"Forum Mall",s2);

        m1.display();
        m2.display();
    }
}