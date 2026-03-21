class CellExecutor {
    public static void main(String[] args) {

        Cell c1 = new Cell(1,"Animal","Round","Basic Unit",0.01,
                "Simple","Present","Flexible","Fluid",
                "Many","Mitosis","ATP","Fast","Yes",
                4.5,"Bio","Normal","Quick","High","Short");

        Cell c2 = new Cell(2,"Plant","Rectangular","Photosynthesis",0.02,
                "Rigid","Present","Strong","Dense",
                "Chloroplast","Mitosis","Solar","Slow","Yes",
                4.7,"Botany","Healthy","Medium","Medium","Long");

        c1.display();
        c2.display();
    }
}