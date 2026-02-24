class EatSure {

    public static double search(String foodName, int quantity){

        double price = 0.0;
        double totalPrice = 0.0;

        if(foodName.equals("Burger")){
            price = 122; totalPrice = price * quantity;

        } else if(foodName.equals("Pizza")){
            price = 252; totalPrice = price * quantity;

        } else if(foodName.equals("Pasta")){
            price = 182; totalPrice = price * quantity;

        } else if(foodName.equals("Sandwich")){
            price = 94; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 84; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 118; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 228; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 168; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 158; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 74; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 102; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 138; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 208; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 248; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 63; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 53; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 43; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 43; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 33; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 27; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 97; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 107; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 148; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 128; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 118; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 138; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 365; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 315; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 295; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 165; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in EatSure");
            return 0.0;
        }

        System.out.println("App: EatSure");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}