class Bangle {

    String material;

    Bangle(){
        System.out.println("Default constructor invoked");
    }

    Bangle(String material){
        this.material = material;
        System.out.println("Bangle Parameterized Constructor Invoked");
    }
}