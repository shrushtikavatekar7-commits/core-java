class DiabetesExecutor {
    public static void main(String[] args) {

        Diabetes d1 = new Diabetes(1,"Type1","Genetic","Fatigue",
                "Insulin",true,"High","Blood Test","Diet",
                "Low Sugar","Daily","Insulin","Dr.A","City Hospital",
                180,"High","Adult","Active","Regular","Chronic");

        Diabetes d2 = new Diabetes(2,"Type2","Lifestyle","Thirst",
                "Medicine",false,"Medium","Test","Exercise",
                "Balanced","Weekly","Tablets","Dr.B","Care Hospital",
                150,"Medium","Adult","Sedentary","Monthly","Long");

        d1.display();
        d2.display();
    }
}