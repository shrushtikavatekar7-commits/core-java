class GarlicExecutor {
    public static void main(String[] args) {

        Garlic g1 = new Garlic(1,"White","White",1.0,200,
                "India",true,"Strong","High","Local",10,
                "Bag","ABC","UAE",4.5,"Large",
                "Winter","Cool","Cooking","6 months");

        Garlic g2 = new Garlic(2,"Desi","Off-white",0.8,180,
                "India",false,"Medium","Good","Farm",8,
                "Packet","XYZ","UK",4.0,"Medium",
                "Summer","Dry","Food","5 months");

        g1.display();
        g2.display();
    }
}