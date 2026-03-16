class Coffee {

    String type;
    double price;

    Coffee(){
        System.out.println("Default constructor invoked");
    }

    Coffee(String type, double price){
        this.type = type;
        this.price = price;
        System.out.println("Coffee Parameterized Constructor Invoked");
    }
}