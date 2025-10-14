package week8.ex9;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 1. Create a VehicleRegister instance
        VehicleRegister register = new VehicleRegister();
        System.out.println("--- 1. Testing ADD, GET, and Duplicates ---");

        // Create RegistrationPlate objects
        RegistrationPlate plate1 = new RegistrationPlate("FI", "ABC-123"); // Arto's first car
        RegistrationPlate plate2 = new RegistrationPlate("FI", "UXE-465"); // Arto's second car
        RegistrationPlate plate3 = new RegistrationPlate("D", "B WQ-431"); // Jürgen's car
        RegistrationPlate plate4 = new RegistrationPlate("FI", "ABC-123"); // Duplicate of plate1

        // Test add() functionality
        System.out.println("Adding plate1 (Arto): " + register.add(plate1, "Arto")); // Should be true
        System.out.println("Adding plate2 (Arto): " + register.add(plate2, "Arto")); // Should be true
        System.out.println("Adding plate3 (Jürgen): " + register.add(plate3, "Jürgen")); // Should be true

        // Test adding a duplicate plate
        System.out.println("Adding plate4 (Arto): " + register.add(plate4, "Antti")); // Should be false (plate1 is already registered)

        // Test get() functionality
        System.out.println("\n--- 2. Testing GET ---");
        System.out.println("Owner of FI ABC-123: " + register.get(new RegistrationPlate("FI", "ABC-123"))); // Should be Arto
        System.out.println("Owner of D B WQ-431: " + register.get(plate3)); // Should be Jürgen
        System.out.println("Owner of SE XYZ-999: " + register.get(new RegistrationPlate("SE", "XYZ-999"))); // Should be null

        // Test printRegistrationPlates()
        System.out.println("\n--- 3. Testing printRegistrationPlates ---");
        System.out.println("All registered plates:");
        register.printRegistrationPlates(); // Should print plate1, plate2, plate3

        // Test printOwners()
        System.out.println("\n--- 4. Testing printOwners (Unique) ---");
        System.out.println("All unique owners:");
        register.printOwners(); // Should print Arto and Jürgen (Arto only once)

        // Test delete()
        System.out.println("\n--- 5. Testing DELETE ---");

        // Delete an existing plate
        System.out.println("Deleting plate3 (D B WQ-431): " + register.delete(plate3)); // Should be true

        // Try to get the deleted plate
        System.out.println("Owner of D B WQ-431 after deletion: " + register.get(plate3)); // Should be null

        // Delete a non-existent plate
        System.out.println("Deleting a non-existent plate: " + register.delete(new RegistrationPlate("FI", "AAA-111"))); // Should be false

        // Final check of plates and owners after deletion
        System.out.println("\n--- 6. Final State ---");
        System.out.println("Remaining registered plates:");
        register.printRegistrationPlates(); // Should only print plate1 and plate2

        System.out.println("Remaining unique owners:");
        register.printOwners();
    }
}
