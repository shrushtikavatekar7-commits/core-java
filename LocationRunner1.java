class LocationRunner1 {
    public static void main(String[] args) {

        Map map = new Map();
        map.latitude = 12.97;
        map.longitude = 77.59;
        map.type = "Satellite";

        Location location = new Location(1, "Bangalore", map);
        location.getLocationDetails();
    }
}