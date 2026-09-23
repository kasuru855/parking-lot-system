import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Initializing Parking Lot System ---");
        ParkingLot parkingLot = new ParkingLot(20);
        
        while (true) {
            System.out.println("\n===== PARKING LOT MENU =====");
            System.out.println("1. Park a Car");
            System.out.println("2. Park a Motorcycle");
            System.out.println("3. Exit System");
            System.out.print("Select an option (1-3): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 3) {
                System.out.println("Exiting Parking Lot Management System. Goodbye!");
                break;
            }

            System.out.print("Enter vehicle license plate number: ");
            String plate = scanner.nextLine();

            if (choice == 1) {
                Car myCar = new Car(plate);
                parkingLot.parkVehicle(myCar);
            } else if (choice == 2) {
                Vehicle bike = new Vehicle(plate, VehicleType.MOTORCYCLE) {}; 
                parkingLot.parkVehicle(bike);
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
