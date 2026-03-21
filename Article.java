class Article {

    int id;
    String title;
    String category;

    public Article(int id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public void display() {
        System.out.println("Article: " + id + " " + title + " " + category);
    }
}