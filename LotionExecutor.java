class LotionExecutor {
    public static void main(String[] args) {

        Lotion l1 = new Lotion(1,"Nivea","Moisturizer","Dry",250,
                "200ml","Mild",false,"White","Daily",
                "Aloe","Germany","ABC",4.5,"Soft",
                "Bottle","Medium","Smooth","2 years","No");

        Lotion l2 = new Lotion(2,"Vaseline","Hydration","All",200,
                "150ml","None",false,"White","Daily",
                "Petroleum","USA","XYZ",4.6,"Hydrated",
                "Bottle","Small","Thick","3 years","No");

        l1.display();
        l2.display();
    }
}