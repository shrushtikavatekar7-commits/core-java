class State {

	private String highwayNames[] = new String[9];
	int index;

	public boolean addHighwayName(String highwayName){
		boolean isAdded = false;

		if(highwayName != null && !highwayName.isEmpty()){
			highwayNames[index] = highwayName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(highwayName + " is invalid");
		}

		return isAdded;
	}

	public void getHighwayNames(){
		for(String highway : highwayNames){
			System.out.println(highway);
		}
	}
}