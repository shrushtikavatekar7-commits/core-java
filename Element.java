class Element {

    int atomicNumber;
    String name;
    String symbol;

    public Element(int atomicNumber, String name, String symbol) {
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
    }

    public void display() {
        System.out.println("Element: " + atomicNumber + " " + name + " " + symbol);
    }
}