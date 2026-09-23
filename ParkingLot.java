import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSlot> slots;

    public ParkingLot(int totalSlots) {
        slots = new ArrayList<>();
        for (int i = 1; i <= totalSlots; i++) {
            if (i <= 5) slots.add(new ParkingSlot(i, VehicleType.MOTORCYCLE));
            else if (i <= 15) slots.add(new ParkingSlot(i, VehicleType.CAR));
            else slots.add(new ParkingSlot(i, VehicleType.TRUCK));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.park(vehicle)) {
                System.out.println(vehicle.getType() + " [" + vehicle.getLicensePlate() + "] successfully parked in spot #" + slot.getSlotNumber());
                return true;
            }
        }
        System.out.println("Sorry, no available spots for a " + vehicle.getType());
        return false;
    }
}
