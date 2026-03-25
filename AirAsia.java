class AirAsia {

	private String passengerNames[] = new String[30];
	int index;

	public boolean addPassengerName(String passengerName){
		boolean isAdded = false;

		if(passengerName != null && !passengerName.isEmpty()){
			if(index < passengerNames.length){
				passengerNames[index] = passengerName;
				index++;
				isAdded = true;
			}else{
				System.out.println("Passenger list is full");
			}
		}
		else{
			System.out.println(passengerName + " is invalid");
		}

		return isAdded;
	}

	public void getPassengerNames(){
		for(int i = 0; i < index; i++){
			System.out.println(passengerNames[i]);
		}
	}
}