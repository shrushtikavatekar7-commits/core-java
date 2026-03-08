class BreadRunner {

    public static void main(String[] args) {

        Bread b1 = new Bread();
        b1.type = "Brown";
        b1.outletName = "Iyengar";
        b1.ingredient = "Wheat";
        b1.shape = "Square";

        Bread b2 = new Bread();
        b2.type = "White";
        b2.outletName = "Modern";
        b2.ingredient = "Maida";
        b2.shape = "Rectangle";

        Bread b3 = new Bread();
        b3.type = "Milk";
        b3.outletName = "LocalBakery";
        b3.ingredient = "Milk";
        b3.shape = "Square";

        Bread b4 = new Bread();
        b4.type = "Multigrain";
        b4.outletName = "Britannia";
        b4.ingredient = "Grains";
        b4.shape = "Round";

        System.out.println("Bread1 Type: " + b1.type);
        System.out.println("Bread1 Outlet: " + b1.outletName);
        System.out.println("Bread1 Ingredient: " + b1.ingredient);
        System.out.println("Bread1 Shape: " + b1.shape);

        System.out.println("Bread2 Type: " + b2.type);
        System.out.println("Bread2 Outlet: " + b2.outletName);
        System.out.println("Bread2 Ingredient: " + b2.ingredient);
        System.out.println("Bread2 Shape: " + b2.shape);
    }
}