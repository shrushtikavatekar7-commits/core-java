class Keyboard {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int keys;
    String connectivity;
    String layout;
    String compatibility;
    String country;
    boolean isMechanical;
    boolean isBacklit;

    public Keyboard(int id, String brand, String type, String color,
                    double price, int keys, String connectivity,
                    String layout, String compatibility, String country,
                    boolean isMechanical, boolean isBacklit) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.keys = keys;
        this.connectivity = connectivity;
        this.layout = layout;
        this.compatibility = compatibility;
        this.country = country;
        this.isMechanical = isMechanical;
        this.isBacklit = isBacklit;
    }

    public void display() {
        System.out.println("Keyboard Details:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Keys: " + keys);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Layout: " + layout);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Country: " + country);
        System.out.println("Mechanical: " + isMechanical);
        System.out.println("Backlit: " + isBacklit);
    }
}