class PcExecutor {

    public static void main(String[] args) {

        Hardware h1 = new Hardware(1,"Intel i5","Processor");
        Pc p1 = new Pc(101,"HP",h1);

        Hardware h2 = new Hardware(2,"8GB RAM","Memory");
        Pc p2 = new Pc(102,"Dell",h2);

        p1.display();
        p2.display();
    }
}