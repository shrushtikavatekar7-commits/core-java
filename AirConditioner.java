class AirConditioner {

static boolean isConnected;
static int currentTemp = 20;
static int maxTemp = 30;

static boolean onOrOff() {

if(isConnected == false){
isConnected = true;
System.out.println("AC is turned On...");
}else{
isConnected = false;
System.out.println("AC is turned Off...");
}

return isConnected;
}

public static void increaseTemp(){

if(isConnected == true){

if(currentTemp < maxTemp){
currentTemp = currentTemp + 1;
System.out.println("Current Temperature : " + currentTemp);
}else{
System.out.println("Maximum Temperature Reached...");
}

}else{
System.out.println("First Turn On the AC...");
}
}

public static void decreaseTemp(){

if(isConnected == true){

if(currentTemp > 16){
currentTemp = currentTemp - 1;
System.out.println("Current Temperature : " + currentTemp);
}else{
System.out.println("Minimum Temperature Reached...");
}

}else{
System.out.println("First Turn On the AC...");
}
}
}
