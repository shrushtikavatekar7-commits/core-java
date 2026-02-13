class Heater {

static boolean isConnected;
static int heatLevel;
static int maxHeat = 10;

static boolean onOrOff(){

if(isConnected == false){
isConnected = true;
System.out.println("Heater On...");
}else{
isConnected = false;
System.out.println("Heater Off...");
}

return isConnected;
}

public static void increaseHeat(){

if(isConnected == true){

if(heatLevel < maxHeat){
heatLevel = heatLevel + 1;
System.out.println("Heat Level : " + heatLevel);
}else{
System.out.println("Maximum Heat...");
}

}else{
System.out.println("Turn On Heater First...");
}
}

public static void decreaseHeat(){

if(isConnected == true){

if(heatLevel > 0){
heatLevel = heatLevel - 1;
System.out.println("Heat Level : " + heatLevel);
}else{
System.out.println("Minimum Heat...");
}

}else{
System.out.println("Turn On Heater First...");
}
}
}
