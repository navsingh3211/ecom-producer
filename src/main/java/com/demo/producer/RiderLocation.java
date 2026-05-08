package com.demo.producer;

public class RiderLocation {

    private String riderId;
    private double latitute;
    private double longitude;

    public RiderLocation(String riderId, double latitute, double longitude) {
        this.riderId = riderId;
        this.latitute = latitute;
        this.longitude = longitude;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public double getLatitute() {
        return latitute;
    }

    public void setLatitute(double latitute) {
        this.latitute = latitute;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
