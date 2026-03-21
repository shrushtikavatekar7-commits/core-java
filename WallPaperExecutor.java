class WallPaperExecutor {

    public static void main(String[] args) {

        WallPaper w1 = new WallPaper(1,"Asian","Blue","Vinyl",500,
                "10x10",true,"PVC","Floral","Smooth","Living Room",
                "India",100,4.5,"ABC","Striped",true,"Matte","High","Home");

        WallPaper w2 = new WallPaper(2,"Decor","Red","Paper",300,
                "8x10",false,"Paper","Abstract","Rough","Bedroom",
                "India",80,4.0,"XYZ","Plain",false,"Glossy","Medium","Office");

        WallPaper w3 = new WallPaper(3,"HomeStyle","Green","3D",700,
                "12x12",true,"Foam","Nature","Soft","Hall",
                "India",60,4.7,"LMN","Floral",true,"Matte","High","Home");

        
        w1.display();
        w2.display();
        w3.display();
    }
}