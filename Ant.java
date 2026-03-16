class Ant {

    String color;
    int legs;
    boolean isWorker;

    Ant(){
        System.out.println("Default constructor invoked");
    }

    Ant(String color,int legs,boolean isWorker){

        this.color = color;
        this.legs = legs;
        this.isWorker = isWorker;

        System.out.println("Ant Parameterized Constructor Invoked");
    }
}