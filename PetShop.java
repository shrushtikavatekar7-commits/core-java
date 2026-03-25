class PetShop {
	private String petAccessories[] = new String[20];
	int index;

	public boolean addPetAccessory(String accessory){
		boolean isAdded = false;

		if(accessory != null && !accessory.isEmpty()){
			petAccessories[index] = accessory;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(accessory + " is invalid");
		}

		return isAdded;
	}

	public void getPetAccessories(){
		for(String item : petAccessories){
			System.out.println(item);
		}
	}
}