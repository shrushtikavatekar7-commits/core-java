class DumbBellExecutor {
    public static void main(String[] args) {

        DumbBell d1 = new DumbBell(1,"ProFit",10,"Iron","Black",2000,
                "Fixed",false,"Gym","Round","Rubber","Coated",
                "India","ABC",4.5,"High","Medium","Modern","Box","1 year");

        DumbBell d2 = new DumbBell(2,"Flex",15,"Steel","Silver",3000,
                "Adjustable",true,"Home","Hex","Textured","Chrome",
                "USA","XYZ",4.7,"High","Large","Premium","Case","2 years");

        d1.display();
        d2.display();
    }
}