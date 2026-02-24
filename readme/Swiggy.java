class Swiggy {

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
            price = 95; totalPrice = price * quantity;

        } else if(foodName.equals("Fries")){
            price = 85; totalPrice = price * quantity;

        } else if(foodName.equals("Momos")){
            price = 120; totalPrice = price * quantity;

        } else if(foodName.equals("Biryani")){
            price = 230; totalPrice = price * quantity;

        } else if(foodName.equals("Fried Rice")){
            price = 170; totalPrice = price * quantity;

        } else if(foodName.equals("Noodles")){
            price = 160; totalPrice = price * quantity;

        } else if(foodName.equals("Ice Cream")){
            price = 75; totalPrice = price * quantity;

        } else if(foodName.equals("Brownie")){
            price = 100; totalPrice = price * quantity;

        } else if(foodName.equals("Milkshake")){
            price = 140; totalPrice = price * quantity;

        } else if(foodName.equals("Paneer Tikka")){
            price = 210; totalPrice = price * quantity;

        } else if(foodName.equals("Chicken Tikka")){
            price = 250; totalPrice = price * quantity;

        } else if(foodName.equals("Dosa")){
            price = 65; totalPrice = price * quantity;

        } else if(foodName.equals("Idli")){
            price = 55; totalPrice = price * quantity;

        } else if(foodName.equals("Vada")){
            price = 45; totalPrice = price * quantity;

        } else if(foodName.equals("Coffee")){
            price = 45; totalPrice = price * quantity;

        } else if(foodName.equals("Tea")){
            price = 35; totalPrice = price * quantity;

        } else if(foodName.equals("Samosa")){
            price = 30; totalPrice = price * quantity;

        } else if(foodName.equals("Roll")){
            price = 100; totalPrice = price * quantity;

        } else if(foodName.equals("Wrap")){
            price = 110; totalPrice = price * quantity;

        } else if(foodName.equals("Taco")){
            price = 150; totalPrice = price * quantity;

        } else if(foodName.equals("Nachos")){
            price = 130; totalPrice = price * quantity;

        } else if(foodName.equals("Soup")){
            price = 120; totalPrice = price * quantity;

        } else if(foodName.equals("Salad")){
            price = 140; totalPrice = price * quantity;

        } else if(foodName.equals("Steak")){
            price = 370; totalPrice = price * quantity;

        } else if(foodName.equals("Grill Chicken")){
            price = 320; totalPrice = price * quantity;

        } else if(foodName.equals("Fish Fry")){
            price = 300; totalPrice = price * quantity;

        } else if(foodName.equals("Cheesecake")){
            price = 170; totalPrice = price * quantity;

        } else{
            System.out.println("Food not found in Swiggy");
            return 0.0;
        }

        System.out.println("App: Swiggy");
        System.out.println("Food: " + foodName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);

        return totalPrice;
    }
}