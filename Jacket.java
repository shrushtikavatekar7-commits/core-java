class Jacket {

    String brand;
    String color;
    String size;
    double price;
    boolean isWaterproof;

    Jacket(){
        System.out.println("Default constructor invoked");
    }

    Jacket(String brand,String color,String size,double price,boolean isWaterproof){

        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isWaterproof = isWaterproof;

        System.out.println("Jacket Parameterized Constructor Invoked");
    }
}