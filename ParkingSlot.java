public class ParkingSlot {
    private int slotNumber;
    private VehicleType allowedType;
    private Vehicle parkedVehicle; 

    public ParkingSlot(int slotNumber, VehicleType allowedType) {
        this.slotNumber = slotNumber;
        this.allowedType = allowedType;
        this.parkedVehicle = null; 
    }

    public boolean isAvailable() { return parkedVehicle == null; }

    public boolean park(Vehicle vehicle) {
        if (isAvailable() && vehicle.getType() == allowedType) {
            this.parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public void removeVehicle() { this.parkedVehicle = null; }
    public Vehicle getParkedVehicle() { return parkedVehicle; }
    public int getSlotNumber() { return slotNumber; }
}
