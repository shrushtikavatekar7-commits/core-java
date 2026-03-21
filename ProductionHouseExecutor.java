class ProductionHouseExecutor {

    public static void main(String[] args) {

        Movie m1 = new Movie(1,"KGF","Action");
        ProductionHouse p1 = new ProductionHouse(101,"Hombale Films",m1);

        Movie m2 = new Movie(2,"RRR","Drama");
        ProductionHouse p2 = new ProductionHouse(102,"DVV Entertainment",m2);

        p1.display();
        p2.display();
    }
}