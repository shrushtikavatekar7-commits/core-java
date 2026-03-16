class Anklet {

    String material;
    double price;

    Anklet(){
        System.out.println("Default constructor invoked");
    }

    Anklet(String material,double price){
        this.material = material;
        this.price = price;

        System.out.println("Anklet Parameterized Constructor Invoked");
    }
}