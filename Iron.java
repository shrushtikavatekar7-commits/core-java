class Iron {

static boolean isConnected;
static int heatLevel;
static int maxHeat = 10;

static boolean onOrOff(){

if(isConnected == false){
isConnected = true;
System.out.println("Iron is On...");
}else{
isConnected = false;
System.out.println("Iron is Off...");
}

return isConnected;
}

public static void increaseHeat(){

if(isConnected == true){

if(heatLevel < maxHeat){
	heatLevel = heatLevel + 1;
	System.out.println("Heat Level : " + heatLevel);
}else{
	System.out.println("Maximum Heat Level...");
}

}else{
System.out.println("Turn On Iron First...");
}
}

public static void decreaseHeat(){

if(isConnected == true){

if(heatLevel > 0){
	heatLevel = heatLevel - 1;
	System.out.println("Heat Level : " + heatLevel);
}else{
	System.out.println("Minimum Heat Level...");
}

}else{
System.out.println("Turn On Iron First...");
}
}
}
