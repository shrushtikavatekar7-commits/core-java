class Camera {

static boolean isConnected;
static int zoomLevel;
static int maxZoom = 8;

static boolean onOrOff(){

if(isConnected == false){
isConnected = true;
System.out.println("Camera On...");
}else{
isConnected = false;
System.out.println("Camera Off...");
}

return isConnected;
}

public static void increaseZoom(){

if(isConnected == true){

if(zoomLevel < maxZoom){
	zoomLevel = zoomLevel + 1;
	System.out.println("Zoom Level : " + zoomLevel);
}else{
	System.out.println("Maximum Zoom...");
}

}else{
System.out.println("Turn On Camera First...");
}
}

public static void decreaseZoom(){

if(isConnected == true){

if(zoomLevel > 0){
	zoomLevel = zoomLevel - 1;
	System.out.println("Zoom Level : " + zoomLevel);
}else{
	System.out.println("Minimum Zoom...");
}

}else{
System.out.println("Turn On Camera First...");
}
}
}
