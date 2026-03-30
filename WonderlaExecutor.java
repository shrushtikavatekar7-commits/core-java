class WonderlaExecutor {

    public static void main(String[] args) {

        Wonderla wonderla = new Wonderla();

        wonderla.addWaterGame("Wave Pool");
        wonderla.addWaterGame("Lazy River");
        wonderla.addWaterGame("Rain Disco");

        System.out.println("All Water Games:");
        wonderla.getAllWaterGames();

        System.out.println("-----------");

        wonderla.updateWaterGame("Lazy River", "Aqua Dance");

        System.out.println("After Update:");
        wonderla.getAllWaterGames();

        System.out.println("-----------");

        wonderla.deleteWaterGame("Wave Pool");

        System.out.println("After Delete:");
        wonderla.getAllWaterGames();
    }
}