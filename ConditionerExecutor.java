class ConditionerExecutor {

    public static void main(String[] args) {

        Conditioner c1 = new Conditioner(1,"Dove","Smooth","Dry Hair",300,
                "200ml","Mild",false,"White","Daily",
                "Milk","India","ABC",4.5,"Soft",
                "Bottle","Medium","Creamy","2 years","No");

        Conditioner c2 = new Conditioner(2,"Pantene","Repair","Damaged Hair",350,
                "180ml","Strong",false,"White","Weekly",
                "Keratin","India","XYZ",4.6,"Shiny",
                "Bottle","Medium","Smooth","2 years","No");

        Conditioner c3 = new Conditioner(3,"Loreal","Total Repair","All Hair",400,
                "250ml","Floral",true,"Cream","Daily",
                "Protein","France","LMN",4.7,"Strong",
                "Bottle","Large","Thick","3 years","Yes");

        
        c1.display();
        c2.display();
        c3.display();
    }
}