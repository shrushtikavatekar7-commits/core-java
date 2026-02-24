class FoodPanda {

    public static double search(String foodName, int quantity){

        double price = 0.0;
        double totalPrice = 0.0;

        if(foodName.equals("Burger")){
            price = 128; totalPrice = price * quantity;

        } else if(foodName.equals("Pizza")){
            price = 258; totalPrice = price * quantity;

        } else if(foodName.equals("Pasta")){
            price = 188; totalPrice = price * quantity;

        } else if(foodName.equals("Sandwich")){
            price = 98; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 88; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 125; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 235; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 175; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 165; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 78; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 105; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 145; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 215; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 255; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 68; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 58; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 48; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 48; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 38; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 32; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 102; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 112; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 155; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 135; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 125; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 145; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 380; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 330; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 310; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 175; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in FoodPanda");
            return 0.0;
        }

        System.out.println("App: FoodPanda");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}