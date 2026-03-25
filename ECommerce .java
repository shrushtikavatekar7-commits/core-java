class ECommerce {

	private String productNames[] = new String[26];
	int index;

	public boolean addProductName(String productName){
		boolean isAdded = false;

		if(productName != null && !productName.isEmpty()){
			productNames[index] = productName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(productName + " is invalid");
		}

		return isAdded;
	}

	public void getProductNames(){
		for(String product : productNames){
			System.out.println(product);
		}
	}
}