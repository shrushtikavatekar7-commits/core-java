class RCBExecutor {
    public static void main(String[] args){

        RCB rcb = new RCB();
		
		RCB.addPlayerName("Virat Kohli");
		RCB.addPlayerName("Faf du Plessis");
		RCB.addPlayerName("Glenn Maxwell");
		RCB.addPlayerName("Rajat Patidar");
		RCB.addPlayerName("Dinesh Karthik");
		RCB.addPlayerName("Mohammed Siraj");
		RCB.addPlayerName("Harshal Patel");
		RCB.addPlayerName("Akash Deep");
		RCB.addPlayerName("Suyash Prabhudessai");
		RCB.addPlayerName("Josh Hazlewood");
		RCB.addPlayerName
		RCB.addPlayerName
		RCB.addPlayerName

        String[] players = {
            "Virat Kohli", "Faf du Plessis", "Glenn Maxwell", "Rajat Patidar",
            "Dinesh Karthik", "Mohammed Siraj", "Harshal Patel",
            "Wanindu Hasaranga", "Josh Hazlewood", "Shahbaz Ahmed",
            "Anuj Rawat", "Suyash Prabhudessai", "Mahipal Lomror",
            "Karn Sharma", "Akash Deep"
        };

        for (String player : players) {
            rcb.addPlayerName(player);
        }

        System.out.println("RCB Team Players:");
        rcb.getPlayerNames();
    }
}