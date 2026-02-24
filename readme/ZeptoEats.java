class ZeptoEats {

    public static double search(String foodName, int quantity){

        double price = 0.0;
        double totalPrice = 0.0;

        if(foodName.equals("Burger")){
            price = 118; totalPrice = price * quantity;

        } else if(foodName.equals("Pizza")){
            price = 245; totalPrice = price * quantity;

        } else if(foodName.equals("Pasta")){
            price = 175; totalPrice = price * quantity;

        } else if(foodName.equals("Sandwich")){
            price = 88; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 78; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 108; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 215; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 155; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 145; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 68; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 92; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 128; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 195; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 235; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 58; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 48; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 38; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 38; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 28; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 22; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 85; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 95; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 135; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 115; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 105; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 125; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 340; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 295; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 270; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 145; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in ZeptoEats");
            return 0.0;
        }

        System.out.println("App: ZeptoEats");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}