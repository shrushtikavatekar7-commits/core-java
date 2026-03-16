class ShoeLace {

    String brand;
    String color;
    int length;
    String material;
    double price;
    boolean isElastic;
    String type;
    String country;
    boolean isWaterproof;
    int thickness;

    ShoeLace(){
        System.out.println("Default constructor invoked");
    }

    ShoeLace(String brand,String color,int length,String material,double price,
    boolean isElastic,String type,String country,boolean isWaterproof,int thickness){

        this.brand = brand;
        this.color = color;
        this.length = length;
        this.material = material;
        this.price = price;
        this.isElastic = isElastic;
        this.type = type;
        this.country = country;
        this.isWaterproof = isWaterproof;
        this.thickness = thickness;

        System.out.println("ShoeLace Parameterized Constructor Invoked");
    }
}