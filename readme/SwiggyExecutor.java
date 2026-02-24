class SwiggyExecutor {

    public static void main(String[] args) {

        double amount = Swiggy.search("Pizza", 4);

        System.out.println("Returned Amount: " + amount);
    }
}