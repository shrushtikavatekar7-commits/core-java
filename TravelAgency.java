class TravelAgency {

	private String places[] = new String[17];
	int index;

	public boolean addPlace(String place){
		boolean isAdded = false;

		if(place != null && !place.isEmpty()){
			places[index] = place;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(place + " is invalid");
		}

		return isAdded;
	}

	public void getPlaces(){
		for(String place : places){
			System.out.println(place);
		}
	}
}