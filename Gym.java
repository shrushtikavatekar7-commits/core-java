class Gym {

	private String equipments[] = new String[16];
	int index;

	public boolean addEquipment(String equipment){
		boolean isAdded = false;

		if(equipment != null && !equipment.isEmpty()){
			equipments[index] = equipment;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(equipment + " is invalid");
		}

		return isAdded;
	}

	public void getEquipments(){
		for(String item : equipments){
			System.out.println(item);
		}
	}
}