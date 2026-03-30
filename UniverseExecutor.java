class UniverseExecutor {

    public static void main(String[] args) {

        Universe u = new Universe();

        u.addGalaxy("Milky Way");
        u.addGalaxy("Andromeda");
        u.addGalaxy("Sombrero");

        u.getAllGalaxies();

        u.updateGalaxy("Andromeda", "Whirlpool");

        u.getAllGalaxies();

        u.deleteGalaxy("Milky Way");

        u.getAllGalaxies();
    }
}