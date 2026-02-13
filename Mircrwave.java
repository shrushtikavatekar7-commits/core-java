class Microwave {

static boolean isConnected;
static int timerLevel;
static int maxTimer = 15;

static boolean onOrOff(){

if(isConnected == false){
isConnected = true;
System.out.println("Microwave is On...");
}else{
isConnected = false;
System.out.println("Microwave is Off...");
}

return isConnected;
}

public static void increaseTimer(){

if(isConnected == true){

if(timerLevel < maxTimer){
	timerLevel = timerLevel + 1;
	System.out.println("Timer Level : " + timerLevel);
}else{
	System.out.println("Maximum Timer Level...");
}

}else{
System.out.println("Turn On Microwave First...");
}
}

public static void decreaseTimer(){

if(isConnected == true){

if(timerLevel > 0){
	timerLevel = timerLevel - 1;
	System.out.println("Timer Level : " + timerLevel);
}else{
	System.out.println("Minimum Timer Level...");
}

}else{
System.out.println("Turn On Microwave First...");
}
}
}
