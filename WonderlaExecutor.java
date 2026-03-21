class WonderlaExecutor {

    public static void main(String[] args) {

        LazyPool l1 = new LazyPool(1,"Wave Pool",100);
        Wonderla w1 = new Wonderla(101,"Bangalore",l1);

        LazyPool l2 = new LazyPool(2,"Kids Pool",50);
        Wonderla w2 = new Wonderla(102,"Hyderabad",l2);

        w1.display();
        w2.display();
    }
}