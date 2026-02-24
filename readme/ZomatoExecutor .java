class ZomatoExecutor {

    public static void main(String[] args) {

        double amount = Zomato.search("Biryani", 3);

        System.out.println("Returned Amount: " + amount);
    }
}