class VVPuramExecutor {

    public static void main(String[] args) {

        FoodStreet f1 = new FoodStreet(1,"VV Puram","Chats");
        VVPuram v1 = new VVPuram(101,"Bangalore",f1);

        FoodStreet f2 = new FoodStreet(2,"Street Food","Dosa");
        VVPuram v2 = new VVPuram(102,"Mysore",f2);

        v1.display();
        v2.display();
    }
}