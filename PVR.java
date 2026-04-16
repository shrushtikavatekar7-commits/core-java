class PVR{

    int pvrId;
    String pvrName;
    Screen screen 
	
	PVR(int pvrId,String pvrName,Screen screen ){
	this.pvrId=pvrId
	   this.pvrName = pvrName;
        this.screen = screen;
    }

public boolean savePvr(Screen screen ) {

        System.out.println("Parameter screen visible : " + screen );
        System.out.println("Instance screen avaiable: " + this.screen);

        boolean isSaved = false;

        boolean isPriceValid = false;
        boolean isSeatsValid = false;
        boolean isTypeValid = false;
		
		 if (screen != null) {

            if (screen.seats > 0) {
                isSeatsValid = true;
            }

            if (screen.type != null && !screen.type.isEmpty()) {
                isTypeValid = true;
            }

            if (screen.price > 0) {
                isPriceValid = true;
            }

            if (isSeatsValid && isTypeValid && isPriceValid) {
                this.screen = screen;
                isSaved = true;
            }
        }

        return isSaved;
    }

    public void getPVRDetails() {
        System.out.println("PVR ID: " + this.pvrId);
        System.out.println("PVR Name: " + this.pvrName);

        System.out.println("Screen Seats: " + this.screen.seats);
        System.out.println("Screen Type: " + this.screen.type);
        System.out.println("Screen Price: " + this.screen.price);
    }
}