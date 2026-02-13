class Mixer {

static boolean isConnected;
static int speed;
static int maxSpeed = 6;

static boolean onOrOff(){

if(isConnected == false){
isConnected = true;
System.out.println("Mixer is On...");
}else{
isConnected = false;
System.out.println("Mixer is Off...");
}

return isConnected;
}

public static void increaseSpeed(){

if(isConnected == true){

if(speed < maxSpeed){
	speed = speed + 1;
	System.out.println("Mixer Speed : " + speed);
}else{
	System.out.println("Maximum Speed...");
}

}else{
System.out.println("Turn On Mixer First...");
}
}

public static void decreaseSpeed(){

if(isConnected == true){

if(speed > 0){
	speed = speed - 1;
	System.out.println("Mixer Speed : " + speed);
}else{
	System.out.println("Minimum Speed...");
}

}else{
System.out.println("Turn On Mixer First...");
}
}
}
