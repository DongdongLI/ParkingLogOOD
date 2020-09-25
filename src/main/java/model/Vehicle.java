package model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String licensePlate;
    private List<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();;
    private int spotsNeeded;
    private VehicleSize size;

    public void parkInSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    private void removeFromSpot() {
        parkingSpots.clear();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public void setSpotsNeeded(int spotsNeeded) {
        this.spotsNeeded = spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void setSize(VehicleSize size) {
        this.size = size;
    }
}
