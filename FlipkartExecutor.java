class FlipkartExecutor {
    public static void main(String[] args) {

        Flipkart.login("rahul", "flip123");
        Flipkart.login(9876543210L);
        Flipkart.login("rahul@gmail.com", 445566);
    }
}