package ee.eovchar.geotracker;

import java.util.HashMap;

public class MyLocation extends HashMap<String, String>{

    public static final String DATE = "date";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";

    public MyLocation (String date, String latitude, String longitude) {
        super();
        super.put(DATE, date);
        super.put(LATITUDE, latitude);
        super.put(LONGITUDE, longitude);
    }

}