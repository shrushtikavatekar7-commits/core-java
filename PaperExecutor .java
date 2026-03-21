class PaperExecutor {
    public static void main(String[] args) {

        Paper p1 = new Paper(1,"A4","210x297","White",250,
                "JK",500,"High",true,"Printing","Thin","Smooth",
                "India","ABC",4.5,"Pack","Matte","70","Rectangle","Medium");

        Paper p2 = new Paper(2,"A3","297x420","White",400,
                "Classmate",300,"Medium",false,"Drawing","Thick","Rough",
                "India","XYZ",4.0,"Bundle","Glossy","80","Rectangle","High");

        p1.display();
        p2.display();
    }
}