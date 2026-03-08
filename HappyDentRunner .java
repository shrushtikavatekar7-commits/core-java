class HappyDentRunner {

    public static void main(String[] args) {

        HappyDent h1 = new HappyDent();

        h1.brand = "HappyDent";
        h1.flavor = "Mint";
        h1.price = 10;
        h1.quantity = 5;
        h1.color = "White";
        h1.type = "ChewingGum";

        h1.ingredients = new String[]{"Sugar","Mint","Flavor"};
        h1.shops = new String[]{"Shop1","Shop2","Shop3"};

        System.out.println("Brand: " + h1.brand);
        System.out.println("Flavor: " + h1.flavor);
        System.out.println("Price: " + h1.price);

        System.out.println("Ingredient1: " + h1.ingredients[0]);
        System.out.println("Ingredient2: " + h1.ingredients[1]);
        System.out.println("Ingredient3: " + h1.ingredients[2]);
    }
}