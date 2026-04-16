class LocationRunner2 {
    public static void main(String[] args) {

        Map map = new Map();
        map.latitude = 28.61;
        map.longitude = 77.20;
        map.type = "Terrain";

        Location location = new Location(2, "Delhi", null);

        location.map = map;
        location.getLocationDetails();
    }
}