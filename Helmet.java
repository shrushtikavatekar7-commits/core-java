class Helmet {

    String brand;
    String color;
    double price;

    Helmet(){
        System.out.println("Default constructor invoked");
    }

    Helmet(String brand,String color,double price){
        this.brand = brand;
        this.color = color;
        this.price = price;

        System.out.println("Helmet Parameterized Constructor Invoked");
    }
}