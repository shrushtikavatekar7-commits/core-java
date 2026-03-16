class Necklace {

    String brand;
    String material;
    String color;
    double price;
    int length;
    String design;
    String type;
    int weight;
    boolean isGold;
    boolean isSilver;
    String stoneType;
    int stones;
    String style;
    boolean isHandmade;
    String country;
    String claspType;
    String polish;
    String gender;
    int year;
    boolean isAdjustable;

    Necklace(){
        System.out.println("Default constructor invoked");
    }

    Necklace(String brand,String material,String color,double price,int length,
    String design,String type,int weight,boolean isGold,boolean isSilver,
    String stoneType,int stones,String style,boolean isHandmade,String country,
    String claspType,String polish,String gender,int year,boolean isAdjustable){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.design = design;
        this.type = type;
        this.weight = weight;
        this.isGold = isGold;
        this.isSilver = isSilver;
        this.stoneType = stoneType;
        this.stones = stones;
        this.style = style;
        this.isHandmade = isHandmade;
        this.country = country;
        this.claspType = claspType;
        this.polish = polish;
        this.gender = gender;
        this.year = year;
        this.isAdjustable = isAdjustable;

        System.out.println("Necklace Parameterized Constructor Invoked");
    }
}