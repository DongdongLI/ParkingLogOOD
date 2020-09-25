package model;

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private int level;

    public ParkingSpot(VehicleSize spotSize, int row, int spotNumber) {
        this.spotSize = spotSize;
        this.row = row;
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public void setSpotSize(VehicleSize spotSize) {
        this.spotSize = spotSize;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public boolean isAvailable() {
        return this.vehicle == null;
    }

    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle removeVehicle() {
        Vehicle temp = this.vehicle;
        this.vehicle = null;
        return temp;
    }
}
