class BunRunner {

    public static void main(String[] args) {

        Bun b1 = new Bun();

        b1.name = "SweetBun";
        b1.brand = "Britannia";
        b1.price = 20;
        b1.type = "Sweet";
        b1.weight = 50;
        b1.color = "Brown";
        b1.shape = "Round";
        b1.taste = "Sweet";
        b1.manufactureDate = "10-03-2026";
        b1.expiryDate = "15-03-2026";

        b1.ingredients = new String[]{"Flour","Sugar","Milk"};
        b1.outlets = new String[]{"Bakery1","Bakery2"};

        System.out.println("Bun Name: " + b1.name);
        System.out.println("Bun Brand: " + b1.brand);
        System.out.println("Bun Price: " + b1.price);

        System.out.println("Ingredient1: " + b1.ingredients[0]);
        System.out.println("Ingredient2: " + b1.ingredients[1]);
        System.out.println("Ingredient3: " + b1.ingredients[2]);
    }
}