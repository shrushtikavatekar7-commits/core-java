class UberEats {

    public static double search(String foodName, int quantity){

        double price = 0.0;
        double totalPrice = 0.0;

        if(foodName.equals("Burger")){
            price = 125; totalPrice = price * quantity;

        } else if(foodName.equals("Pizza")){
            price = 255; totalPrice = price * quantity;

        } else if(foodName.equals("Pasta")){
            price = 185; totalPrice = price * quantity;

        } else if(foodName.equals("Sandwich")){
            price = 92; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 82; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 115; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 225; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 165; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 155; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 72; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 98; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 135; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 205; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 245; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 62; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 52; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 42; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 42; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 32; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 28; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 95; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 105; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 145; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 125; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 115; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 135; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 360; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 310; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 290; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 160; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in UberEats");
            return 0.0;
        }

        System.out.println("App: UberEats");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}