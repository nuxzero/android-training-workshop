package me.cafecode.android.workshop4.models;

/**
 * Created by Natthawut Hemathulin on 4/4/16 AD.
 * Email: natthawut1991@gmail.com
 */
public class Location {

    private double latitude = 0.0;
    private double longitude = 0.0;

    public Location() {
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}