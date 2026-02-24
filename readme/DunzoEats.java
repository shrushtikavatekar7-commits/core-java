class DunzoEats {

    public static double search(String foodName, int quantity){

        double price = 0.0;
        double totalPrice = 0.0;

        if(foodName.equals("Burger")){
            price = 124; totalPrice = price * quantity;

        } else if(foodName.equals("Pizza")){
            price = 254; totalPrice = price * quantity;

        } else if(foodName.equals("Pasta")){
            price = 184; totalPrice = price * quantity;

        } else if(foodName.equals("Sandwich")){
            price = 93; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 83; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 119; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 229; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 169; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 159; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 73; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 101; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 139; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 209; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 249; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 64; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 54; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 44; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 44; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 34; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 29; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 98; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 108; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 149; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 129; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 119; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 139; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 370; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 320; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 300; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 168; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in DunzoEats");
            return 0.0;
        }

        System.out.println("App: DunzoEats");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}