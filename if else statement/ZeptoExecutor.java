class ZeptoExecutor {

    public static void main(String[] args){

        String foodName = "Avocado Toast";

        double price = Zepto.search(foodName);

        System.out.println("The price of " + foodName + " is: " + price);

    }
}
