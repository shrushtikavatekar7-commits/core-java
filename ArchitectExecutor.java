class ArchitectExecutor {

    public static void main(String[] args) {

        Architect a = new Architect();

        a.addDesign("Modern");
        a.addDesign("Classic");
        a.addDesign("Minimalist");

        a.getAllDesigns();

        a.updateDesign("Classic", "Luxury");

        a.getAllDesigns();

        a.deleteDesign("Modern");

        a.getAllDesigns();
    }
}