class BigDaddy {

    int id;
    String owner;
    Cassino cassino;   

    public BigDaddy(int id, String owner, Cassino cassino) {
        this.id = id;
        this.owner = owner;
        this.cassino = cassino;
    }

    public void display() {
        System.out.println("BigDaddy: " + id + " " + owner);
        cassino.display();
        System.out.println("-------------------");
    }
}