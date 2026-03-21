class PepperExecutor {

    public static void main(String[] args) {

        Pepper p1 = new Pepper(1,"Black","Black",1.0,500,
                "India",true,"Spicy","High","Aachi",10,
                "Packet","ABC","USA",4.5,"A",
                "Winter","Cool","Cooking","1 year");

        Pepper p2 = new Pepper(2,"White","White",0.5,600,
                "Vietnam",false,"Mild","Medium","MDH",5,
                "Box","XYZ","UK",4.0,"B",
                "Summer","Dry","Cooking","8 months");

        Pepper p3 = new Pepper(3,"Green","Green",0.8,450,
                "India",true,"Fresh","High","Everest",8,
                "Packet","LMN","Canada",4.3,"A",
                "Monsoon","Cool","Food","10 months");

       
        p1.display();
        p2.display();
        p3.display();
    }
}