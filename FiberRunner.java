class FiberRunner {

    public static void main(String[] args) {

        Fiber f1 = new Fiber();
        f1.name = "Optical";
        f1.length = 100;
        f1.vendor = "Airtel";

        Fiber f2 = new Fiber();
        f2.name = "Glass";
        f2.length = 200;
        f2.vendor = "Jio";

        Fiber f3 = new Fiber();
        f3.name = "Plastic";
        f3.length = 150;
        f3.vendor = "BSNL";

        Fiber f4 = new Fiber();
        f4.name = "Cable";
        f4.length = 120;
        f4.vendor = "ACT";

        System.out.println("Fiber1 Name: " + f1.name);
        System.out.println("Fiber1 Length: " + f1.length);
        System.out.println("Fiber1 Vendor: " + f1.vendor);

        System.out.println("Fiber2 Name: " + f2.name);
        System.out.println("Fiber2 Length: " + f2.length);
        System.out.println("Fiber2 Vendor: " + f2.vendor);

        System.out.println("Fiber3 Name: " + f3.name);
        System.out.println("Fiber3 Length: " + f3.length);
        System.out.println("Fiber3 Vendor: " + f3.vendor);

        System.out.println("Fiber4 Name: " + f4.name);
        System.out.println("Fiber4 Length: " + f4.length);
        System.out.println("Fiber4 Vendor: " + f4.vendor);
    }
}