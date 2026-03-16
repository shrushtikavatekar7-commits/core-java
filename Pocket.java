class Pocket {

    String type;
    String material;
    boolean hasZip;

    Pocket(){
        System.out.println("Default constructor invoked");
    }

    Pocket(String type,String material,boolean hasZip){

        this.type = type;
        this.material = material;
        this.hasZip = hasZip;

        System.out.println("Pocket Parameterized Constructor Invoked");
    }
}