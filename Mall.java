class Mall {

    int id;
    String name;
    Shop shop;   

    public Mall(int id, String name, Shop shop) {
        this.id = id;
        this.name = name;
        this.shop = shop;
    }

    public void display() {
        System.out.println("Mall: " + id + " " + name);
        shop.display();
        System.out.println("-------------------");
    }
}