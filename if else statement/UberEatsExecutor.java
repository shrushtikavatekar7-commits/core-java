class UberEatsExecutor {

    public static void main(String[] args){

        String foodName = "Mexican Rice";

        double price = UberEats.search(foodName);

        System.out.println("The price of " + foodName + " is: " + price);

    }
}
