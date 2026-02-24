class Zomato {

    public static double search(String foodName, int quantity){

        double price = 0.0;
        double totalPrice = 0.0;

        if(foodName.equals("Burger")){
            price = 120; totalPrice = price * quantity;

        } else if(foodName.equals("Pizza")){
            price = 250; totalPrice = price * quantity;

        } else if(foodName.equals("Pasta")){
            price = 180; totalPrice = price * quantity;

        } else if(foodName.equals("Sandwich")){
            price = 90; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 80; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 110; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 220; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 160; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 150; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 70; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 95; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 130; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 200; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 240; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 60; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 50; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 40; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 40; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 30; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 25; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 90; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 100; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 140; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 120; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 110; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 130; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 350; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 300; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 280; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 150; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in Zomato");
            return 0.0;
        }

        System.out.println("App: Zomato");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}