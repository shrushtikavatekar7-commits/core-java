class GoogleExecutor {

    public static void main(String[] args) {

        Google g1 = new Google(1,"Sundar Pichai","Larry Page","USA",100000,1000,
                "Search","Gmail","YouTube",true,50,"USA",1998,
                "Gmail","GCP","Chrome","Android","Gemini","YouTube","Maps");

        Google g2 = new Google(2,"Sundar Pichai","Sergey Brin","USA",120000,1200,
                "Search","Drive","Maps",true,60,"USA",1998,
                "Gmail","Cloud","Chrome","Android","AI","YouTube","Maps");

        Google g3 = new Google(3,"Sundar","Larry","USA",90000,900,
                "Search","Docs","Meet",true,40,"USA",1998,
                "Gmail","Cloud","Chrome","Android","AI","YouTube","Maps");

        
        g1.display();
        g2.display();
        g3.display();
    }
}