class TrophyExecutor {
    public static void main(String[] args) {

        Trophy t1 = new Trophy(1,"Gold Cup","Metal","Gold",5000,
                "Cricket","Large","Cup","Nike",1,
                "Winner","India","2023","India",4.8,
                "Classic","Glossy","High","Sports","ABC");

        Trophy t2 = new Trophy(2,"Silver Star","Steel","Silver",3000,
                "Football","Medium","Star","Adidas",2,
                "Best Player","Brazil","2022","Brazil",4.5,
                "Modern","Matte","Medium","Sports","XYZ");

        t1.display();
        t2.display();
    }
}