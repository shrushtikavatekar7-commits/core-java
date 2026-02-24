class FreshMenu {

    public static double search(String foodName, int quantity){

        double price = 0.0;
        double totalPrice = 0.0;

        if(foodName.equals("Burger")){
            price = 130; totalPrice = price * quantity;

        } else if(foodName.equals("Pizza")){
            price = 260; totalPrice = price * quantity;

        } else if(foodName.equals("Pasta")){
            price = 190; totalPrice = price * quantity;

        } else if(foodName.equals("Sandwich")){
            price = 100; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 90; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 130; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 240; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 180; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 170; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 80; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 110; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 150; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 220; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 260; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 70; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 60; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 50; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 50; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 40; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 35; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 105; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 115; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 160; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 140; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 130; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 150; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 390; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 340; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 320; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 180; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in FreshMenu");
            return 0.0;
        }

        System.out.println("App: FreshMenu");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}