class MuseumExecutor {
	public static void main(String[] args){

		Museum museum = new Museum();

		museum.addHistoricalMonument("Taj Mahal");
		museum.addHistoricalMonument("Qutub Minar");
		museum.addHistoricalMonument("Red Fort");
		museum.addHistoricalMonument("Hampi");
		museum.addHistoricalMonument("Mysore Palace");
		museum.addHistoricalMonument("Charminar");
		museum.addHistoricalMonument("India Gate");
		museum.addHistoricalMonument("Gateway of India");
		museum.addHistoricalMonument("Ajanta Caves");
		museum.addHistoricalMonument("Ellora Caves");
		museum.addHistoricalMonument("Sun Temple");
		museum.addHistoricalMonument("Konark Temple");
		museum.addHistoricalMonument("Meenakshi Temple");
		museum.addHistoricalMonument("Gol Gumbaz");
		museum.addHistoricalMonument("Sanchi Stupa");
		museum.addHistoricalMonument("Fatehpur Sikri");

		museum.getHistoricalMonuments();
	}
}