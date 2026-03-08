class AirConditionerRunner {

    public static void main(String[] args) {

        AirConditioner a1 = new AirConditioner();
        a1.brand = "LG";
        a1.model = "X1";
        a1.price = 35000;
        a1.type = "Split";
        a1.weight = 20;
        a1.color = "White";
        a1.warranty = 2;

        AirConditioner a2 = new AirConditioner();
        a2.brand = "Samsung";
        a2.model = "S2";
        a2.price = 40000;
        a2.type = "Window";
        a2.weight = 25;
        a2.color = "Grey";
        a2.warranty = 3;

        AirConditioner a3 = new AirConditioner();
        a3.brand = "Voltas";
        a3.model = "V3";
        a3.price = 30000;
        a3.type = "Split";
        a3.weight = 18;
        a3.color = "White";
        a3.warranty = 2;

        AirConditioner a4 = new AirConditioner();
        a4.brand = "Daikin";
        a4.model = "D4";
        a4.price = 42000;
        a4.type = "Split";
        a4.weight = 22;
        a4.color = "Silver";
        a4.warranty = 5;

        System.out.println("AC1 Brand: " + a1.brand);
        System.out.println("AC1 Model: " + a1.model);
        System.out.println("AC1 Price: " + a1.price);

        System.out.println("AC2 Brand: " + a2.brand);
        System.out.println("AC2 Model: " + a2.model);
        System.out.println("AC2 Price: " + a2.price);

        System.out.println("AC3 Brand: " + a3.brand);
        System.out.println("AC3 Model: " + a3.model);
        System.out.println("AC3 Price: " + a3.price);

        System.out.println("AC4 Brand: " + a4.brand);
        System.out.println("AC4 Model: " + a4.model);
        System.out.println("AC4 Price: " + a4.price);
    }
}