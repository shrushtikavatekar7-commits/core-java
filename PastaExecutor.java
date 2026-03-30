class PastaExecutor {

    public static void main(String[] args) {

        Pasta p = new Pasta();

        p.addPasta("White Sauce");
        p.addPasta("Red Sauce");
        p.addPasta("Cheese");
        p.addPasta("Penne");
        p.addPasta("Macaroni");
        p.addPasta("Spaghetti");
        p.addPasta("Fusilli");
        p.addPasta("Lasagna");
        p.addPasta("Ravioli");
        p.addPasta("Alfredo");

        p.getAllPastas();

        System.out.println("Index: " + p.searchPasta("Macaroni"));

        p.updatePasta("Macaroni", "Creamy Macaroni");

        p.getAllPastas();

        p.deletePasta("White Sauce");

        p.getAllPastas();
    }
}