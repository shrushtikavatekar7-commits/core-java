class Blanket {

    String material;
    String color;
    double price;
    int size;
    boolean isSoft;
    String brand;

    Blanket(){
        System.out.println("Default constructor invoked");
    }

    Blanket(String material,String color,double price,int size,boolean isSoft,String brand){

        this.material = material;
        this.color = color;
        this.price = price;
        this.size = size;
        this.isSoft = isSoft;
        this.brand = brand;

        System.out.println("Blanket Parameterized Constructor Invoked");
    }
}