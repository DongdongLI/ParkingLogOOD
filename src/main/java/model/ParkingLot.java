package model;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;
    Map<Integer, ParkingFloor> parkingFloors;


    public ParkingLot(List<EntryGate> entryGates, List<ExitGate> exitGates, Map<Integer, ParkingFloor> parkingFloors) {
        this.entryGates = entryGates;
        this.exitGates = exitGates;
        this.parkingFloors = parkingFloors;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) throws RuntimeException {
        for(ParkingFloor floor: parkingFloors.values()) {
            if(floor.hasSpace(vehicle)) {
                return floor.parkVehicle(vehicle);
            }
        }

        throw new RuntimeException("no space to park");
    }

    public Vehicle removeVehicle(ParkingSpot spot) {
        return parkingFloors.get(spot.getLevel()).removeVehicle(spot);
    }
}
