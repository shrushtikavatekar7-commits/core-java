class MapExecutor {
    public static void main(String[] args) {

        Map m1 = new Map(1,"Political","India","1:1000",200,
                "Oxford",2020,"English","Large",true,
                "Education","Multi","Paper","2D",4.5,
                "Asia","World","ABC","Folded","High");

        Map m2 = new Map(2,"Physical","World","1:2000",300,
                "Pearson",2021,"English","Medium",false,
                "Study","Color","Plastic","3D",4.2,
                "Global","Earth","XYZ","Roll","Medium");

        m1.display();
        m2.display();
    }
}