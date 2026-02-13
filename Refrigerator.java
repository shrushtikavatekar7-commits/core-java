class Refrigerator {

static boolean isConnected;
static int coolingLevel;
static int maxCooling = 7;

static boolean onOrOff(){
methods-onOrOff return type-boolean
if(isConnected == false){
isConnected = true;
System.out.println("Refrigerator is On...");
}else{
isConnected = false;
System.out.println("Refrigerator is Off...");
}

return isConnected;
}

public static void increaseCooling(){

if(isConnected == true){

if(coolingLevel < maxCooling){
	coolingLevel = coolingLevel + 1;
	System.out.println("Cooling Level : " + coolingLevel);
}else{
	System.out.println("Maximum Cooling Level...");
}

}else{
System.out.println("Turn On Refrigerator First...");
}
}

public static void decreaseCooling(){

if(isConnected == true){

if(coolingLevel > 0){
	coolingLevel = coolingLevel - 1;
	System.out.println("Cooling Level : " + coolingLevel);
}else{
	System.out.println("Minimum Cooling Level...");
}

}else{
System.out.println("Turn On Refrigerator First...");
}
}
}
