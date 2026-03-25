class UniverseExecutor{
	public static void main(String[] args){

		Universe universe = new Universe();

		universe.addGalaxy("Milky Way");
		universe.addGalaxy("Andromeda");
		universe.addGalaxy("Triangulum");
		universe.addGalaxy("Whirlpool Galaxy");
		universe.addGalaxy("Sombrero Galaxy");
		universe.addGalaxy("Pinwheel Galaxy");
		universe.addGalaxy("Cartwheel Galaxy");
		universe.addGalaxy("Cigar Galaxy");
		universe.addGalaxy("Black Eye Galaxy");
		universe.addGalaxy("Sunflower Galaxy");
		universe.addGalaxy("Centaurus A");
		universe.addGalaxy("Messier 81");
		universe.addGalaxy("Messier 82");
		universe.addGalaxy("NGC 1300");
		universe.addGalaxy("NGC 6744");
		universe.addGalaxy("IC 1101");
		universe.addGalaxy("Large Magellanic Cloud");

		universe.getGalaxies();
	}
}