class LocationRunner3 {
    public static void main(String[] args) {

        Map map = new Map();
        map.latitude = 19.07;
        map.longitude = 72.87;
        map.type = "Roadmap";

        Location location = new Location(3, "Mumbai", null);

        boolean result = location.saveLocation(map);

        System.out.println("Saved: " + result);
        location.getLocationDetails();
    }
}