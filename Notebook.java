class Notebook {

    int id;
    String brand;
    String type;
    String color;
    double price;
    int pages;
    String size;
    String binding;
    String paperQuality;
    String country;
    boolean isRuled;
    boolean isAvailable;

    
    public Notebook(int id, String brand, String type, String color,
                    double price, int pages, String size,
                    String binding, String paperQuality,
                    String country, boolean isRuled,
                    boolean isAvailable) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.pages = pages;
        this.size = size;
        this.binding = binding;
        this.paperQuality = paperQuality;
        this.country = country;
        this.isRuled = isRuled;
        this.isAvailable = isAvailable;
    }

    public void display() {
        System.out.println("Notebook Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
        System.out.println("Size: " + size);
        System.out.println("Binding: " + binding);
        System.out.println("Paper Quality: " + paperQuality);
        System.out.println("Country: " + country);
        System.out.println("Ruled: " + isRuled);
        System.out.println("Available: " + isAvailable);
    }
}