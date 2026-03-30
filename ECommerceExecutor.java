class ECommerceExecutor {

    public static void main(String[] args) {

        ECommerce ecom = new ECommerce();

        ecom.addProduct("Laptop");
        ecom.addProduct("Mobile");
        ecom.addProduct("Headphones");

        System.out.println("All Products:");
        ecom.getAllProducts();

        System.out.println("-----------");

        ecom.updateProduct("Mobile", "Smartphone");

        System.out.println("After Update:");
        ecom.getAllProducts();

        System.out.println("-----------");

        ecom.deleteProduct("Laptop");

        System.out.println("After Delete:");
        ecom.getAllProducts();
    }
}