class PVRExecutor {
    public static void main(String[] args) {

        PVR p1 = new PVR(1,"Mall",5,"Avengers",250,
                "10AM","Recliner",true,"Popcorn",
                "Bangalore","KA","India",200,
                4.5,"Ravi","Dolby","IMAX","Online","English","AC");

        PVR p2 = new PVR(2,"City Center",3,"RRR",200,
                "2PM","Normal",false,"Snacks",
                "Hyderabad","TS","India",150,
                4.2,"Raj","DTS","2D","Offline","Telugu","Parking");

        p1.display();
        p2.display();
    }
}