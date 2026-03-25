class ElectricalShop {

	private String appliances[] = new String[20];
	int index;

	public boolean addAppliance(String appliance){
		boolean isAdded = false;

		if(appliance != null && !appliance.isEmpty()){
			appliances[index] = appliance;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(appliance + " is invalid");
		}

		return isAdded;
	}

	public void getAppliances(){
		for(String item : appliances){
			System.out.println(item);
		}
	}
}