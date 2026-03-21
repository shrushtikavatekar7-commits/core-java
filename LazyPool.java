class LazyPool {

    int id;
    String type;
    int capacity;

    public LazyPool(int id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("LazyPool: " + id + " " + type + " " + capacity);
    }
}