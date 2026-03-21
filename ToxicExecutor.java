class ToxicExecutor {
    public static void main(String[] args) {

        Toxic t1 = new Toxic(1,"Mercury","Metal","Silver",2.5,
                "None",true,"Poison","Earth","Liquid","Hg",
                "Industrial","Cool",4.5,"High","Special",
                "Gloves","Inhalation","Nausea","None");

        Toxic t2 = new Toxic(2,"Chlorine","Gas","Green",1.0,
                "Strong",true,"Irritation","Lab","Gas","Cl2",
                "Cleaning","Sealed",4.0,"Medium","Neutralize",
                "Mask","Inhalation","Cough","Oxygen");

        t1.display();
        t2.display();
    }
}