class DominosExecutor {

    public static void main(String[] args){

        String foodName = "Cheese Burst Deluxe";

        double price = Dominos.search(foodName);

        System.out.println("The price of " + foodName + " is: " + price);

    }
}
