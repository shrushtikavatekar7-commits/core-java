class NewsPaper {

    int id;
    String name;
    Article article;   // HAS-A

    public NewsPaper(int id, String name, Article article) {
        this.id = id;
        this.name = name;
        this.article = article;
    }

    public void display() {
        System.out.println("NewsPaper: " + id + " " + name);
        article.display();
        System.out.println("-------------------");
    }
}