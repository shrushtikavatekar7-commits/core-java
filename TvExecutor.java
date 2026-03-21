class TvExecutor {

    public static void main(String[] args) {

        Channel ch1 = new Channel(1,"Star Sports","Sports");
        Tv t1 = new Tv(101,"Sony",ch1);

        Channel ch2 = new Channel(2,"Zee TV","Entertainment");
        Tv t2 = new Tv(102,"LG",ch2);

        t1.display();
        t2.display();
    }
}