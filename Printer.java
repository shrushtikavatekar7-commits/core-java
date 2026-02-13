class Printer {

static boolean isConnected;
static int printLevel;
static int maxLevel = 5;

static boolean onOrOff(){

if(isConnected == false){
isConnected = true;
System.out.println("Printer is On...");
}else{
isConnected = false;
System.out.println("Printer is Off...");
}

return isConnected;
}

public static void increasePrintLevel(){

if(isConnected == true){

if(printLevel < maxLevel){
	printLevel = printLevel + 1;
	System.out.println("Print Level : " + printLevel);
}else{
	System.out.println("Maximum Print Level...");
}

}else{
System.out.println("Turn On Printer First...");
}
}

public static void decreasePrintLevel(){

if(isConnected == true){

if(printLevel > 0){
	printLevel = printLevel - 1;
	System.out.println("Print Level : " + printLevel);
}else{
	System.out.println("Minimum Print Level...");
}

}else{
System.out.println("Turn On Printer First...");
}
}
}
