class Wonderla {

    int id;
    String location;
    LazyPool lazyPool;   

    public Wonderla(int id, String location, LazyPool lazyPool) {
        this.id = id;
        this.location = location;
        this.lazyPool = lazyPool;
    }

    public void display() {
        System.out.println("Wonderla: " + id + " " + location);
        lazyPool.display();
        System.out.println("-------------------");
    }
}