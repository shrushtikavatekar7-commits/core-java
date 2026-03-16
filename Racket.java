class Racket {

    String brand;
    String type;
    String color;
    double price;
    double weight;
    String gripType;
    String material;
    int length;
    boolean isProfessional;
    String country;
	Racket(){
	System.out.println("Default constructor is invoked.");
	}
    Racket(String brand, String type, String color, double price, double weight,
           String gripType, String material, int length, boolean isProfessional, String country) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.gripType = gripType;
        this.material = material;
        this.length = length;
        this.isProfessional = isProfessional;
        this.country = country;

        System.out.println("Racket Parameterized Constructor Invoked");
    }
}