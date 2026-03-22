public class PaperCupsExecutor {

    public static void main(String[] args) {

        PaperCups p1 = new PaperCups();
        p1.display();

        PaperCups p2 = new PaperCups(150);
        p2.display();

        PaperCups p3 = new PaperCups(160, "Disposable Cups");
        p3.display();
    }
}