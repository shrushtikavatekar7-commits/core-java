class Location {

    int locationId;
    String placeName;
    Map map;

    Location(int locationId, String placeName, Map map) {
        this.locationId = locationId;
        this.placeName = placeName;
        this.map = map;
    }

    public boolean saveLocation(Map map) {

        System.out.println("Parameter map: " + map);
        System.out.println("Instance map: " + this.map);

        boolean isSaved = false;

        boolean isLatitudeValid = false;
        boolean isLongitudeValid = false;
        boolean isTypeValid = false;

        if (map != null) {

            if (map.latitude > 0) {
                isLatitudeValid = true;
            }

            if (map.longitude > 0) {
                isLongitudeValid = true;
            }

            if (map.type != null && !map.type.isEmpty()) {
                isTypeValid = true;
            }

            if (isLatitudeValid && isLongitudeValid && isTypeValid) {
                this.map = map;
                isSaved = true;
            }
        }

        return isSaved;
    }

    public void getLocationDetails() {
        System.out.println("Location ID: " + this.locationId);
        System.out.println("Place Name: " + this.placeName);

        System.out.println("Latitude: " + this.map.latitude);
        System.out.println("Longitude: " + this.map.longitude);
        System.out.println("Map Type: " + this.map.type);
    }
}
