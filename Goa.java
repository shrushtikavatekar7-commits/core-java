class Goa {

	private String beachNames[] = new String[19];
	int index;

	public boolean addBeachName(String beachName){
		boolean isAdded = false;

		if(beachName != null && !beachName.isEmpty()){
			beachNames[index] = beachName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(beachName + " is invalid");
		}

		return isAdded;
	}

	public void getBeachNames(){
		for(String beach : beachNames){
			System.out.println(beach);
		}
	}
}