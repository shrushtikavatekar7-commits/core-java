class Bracelet {

    String brand;
    String material;
    String color;
    double price;
    int size;
    String type;
    String design;
    boolean isGold;
    boolean isSilver;
    String country;
    int weight;
    String style;
    boolean isAdjustable;
    String gender;
    int stones;
    String stoneType;
    String claspType;
    String polish;
    boolean isHandmade;
    int year;

    Bracelet(){
        System.out.println("Default constructor invoked");
    }

    Bracelet(String brand,String material,String color,double price,int size,String type,
    String design,boolean isGold,boolean isSilver,String country,int weight,String style,
    boolean isAdjustable,String gender,int stones,String stoneType,String claspType,
    String polish,boolean isHandmade,int year){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.size = size;
        this.type = type;
        this.design = design;
        this.isGold = isGold;
        this.isSilver = isSilver;
        this.country = country;
        this.weight = weight;
        this.style = style;
        this.isAdjustable = isAdjustable;
        this.gender = gender;
        this.stones = stones;
        this.stoneType = stoneType;
        this.claspType = claspType;
        this.polish = polish;
        this.isHandmade = isHandmade;
        this.year = year;

        System.out.println("Bracelet Parameterized Constructor Invoked");
    }
}