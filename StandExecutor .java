class StandExecutor {
    public static void main(String[] args) {

        Stand s1 = new Stand(1,"Laptop","Metal","Black",1500,
                "HP",15,2,true,"Office","Rectangle",
                "India","ABC",4.5,"Modern","Matte","High",
                "10kg","S1","1 year");

        Stand s2 = new Stand(2,"Mobile","Plastic","White",300,
                "MI",10,1,false,"Home","Round",
                "China","XYZ",4.0,"Simple","Glossy","Medium",
                "2kg","S2","6 months");

        s1.display();
        s2.display();
    }
}