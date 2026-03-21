class Table {

    int id;
    String type;
    String material;
    String color;
    double price;
    double length;
    double width;
    double height;
    String shape;
    String brand;
    String country;
    boolean isFoldable;

   
    public Table(int id, String type, String material, String color,
                 double price, double length, double width, double height,
                 String shape, String brand, String country, boolean isFoldable) {

        this.id = id;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.width = width;
        this.height = height;
        this.shape = shape;
        this.brand = brand;
        this.country = country;
        this.isFoldable = isFoldable;
    }

    public void display() {
        System.out.println("Table Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Shape: " + shape);
        System.out.println("Brand: " + brand);
        System.out.println("Country: " + country);
        System.out.println("Foldable: " + isFoldable);
    }
}