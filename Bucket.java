class Bucket {

    String material;
    String color;
    int capacity;
    double price;
    boolean hasHandle;

    Bucket(){
        System.out.println("Default constructor invoked");
    }

    Bucket(String material,String color,int capacity,double price,boolean hasHandle){

        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
        this.hasHandle = hasHandle;

        System.out.println("Bucket Parameterized Constructor Invoked");
    }
}