class NewsPaperExecutor {

    public static void main(String[] args) {

        Article a1 = new Article(1,"Election News","Politics");
        NewsPaper n1 = new NewsPaper(101,"Times",a1);

        Article a2 = new Article(2,"Match Update","Sports");
        NewsPaper n2 = new NewsPaper(102,"Herald",a2);

        n1.display();
        n2.display();
    }
}