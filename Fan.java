class Fan {

static boolean isConnected;
static int speed;
static int maxSpeed = 5;

static boolean onOrOff(){

if(isConnected == false){
isConnected = true;
System.out.println("Fan is On...");
}else{
isConnected = false;
System.out.println("Fan is Off...");
}

return isConnected;
}

public static void increaseSpeed(){

if(isConnected == true){

if(speed < maxSpeed){
speed = speed + 1;
System.out.println("Current Speed : " + speed);
}else{
System.out.println("Max Speed Reached...");
}

}else{
System.out.println("Turn On the Fan First...");
}
}

public static void decreaseSpeed(){

if(isConnected == true){

if(speed > 0){
speed = speed - 1;
System.out.println("Current Speed : " + speed);
}else{
System.out.println("Minimum Speed...");
}

}else{
System.out.println("Turn On the Fan First...");
}
}
}
