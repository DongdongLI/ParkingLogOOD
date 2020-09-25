package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    private Map<VehicleSize, List<ParkingSpot>> availableSpots;
    private Map<VehicleSize, List<ParkingSpot>> occupiedSpots;

    public ParkingFloor(Map<VehicleSize, List<ParkingSpot>> availableSpots, Map<VehicleSize, List<ParkingSpot>> occupiedSpots) {
        this.availableSpots = availableSpots;
        this.occupiedSpots = occupiedSpots;
    }

    public ParkingFloor() {
        this.availableSpots = new HashMap<VehicleSize, List<ParkingSpot>>();
        this.occupiedSpots = new HashMap<VehicleSize, List<ParkingSpot>>();
    }

    public boolean hasSpace(Vehicle vehicle) {
        return !availableSpots.get(vehicle.getSize()).isEmpty();
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = availableSpots.get(vehicle.getSize()).remove(0);
        occupiedSpots.get(vehicle.getSize()).add(spot);

        spot.park(vehicle);

        return spot;
    }

    public Vehicle removeVehicle(ParkingSpot spot) {
        Vehicle vehicle = spot.removeVehicle();

        occupiedSpots.get(spot.getSpotSize()).remove(spot);
        availableSpots.get(spot.getSpotSize()).add(spot);

        return vehicle;
    }

    public boolean isNotFull() {
        if(occupiedSpots.isEmpty()) {
            return true;
        }

        for(VehicleSize size: availableSpots.keySet()) {
            if(!availableSpots.get(size).isEmpty()) {
                return true;
            }
        }

        return false;
    }
}
