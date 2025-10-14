package week8.ex10;

public class Main {
    public static void main(String[] args) {
        // 1. Testing CivilService
        System.out.println("--- Testing Civil Service ---");

        // CivilService automatically starts at 362 days (based on its constructor)
        CivilService civil = new CivilService();

        System.out.println("Days left at start: " + civil.getDaysLeft()); // Should be 362

        // Simulate 10 days of work
        for (int i = 0; i < 10; i++) {
            civil.work();
        }

        System.out.println("Days left after 10 days: " + civil.getDaysLeft()); // Should be 352

        // Simulate completing the service
        while (civil.getDaysLeft() > 0) {
            civil.work();
        }

        System.out.println("Days left after service complete: " + civil.getDaysLeft()); // Should be 0

        // Try to work when daysLeft is 0 (should remain 0)
        civil.work();
        System.out.println("Days left after working when finished: " + civil.getDaysLeft()); // Should be 0

        System.out.println("\n--- Testing Military Service ---");

        // 2. Testing MilitaryService
        // Military service duration is 180 days for this test
        MilitaryService military = new MilitaryService(180);

        System.out.println("Days left at start: " + military.getDaysLeft()); // Should be 180

        // Simulate 50 days of work
        for (int i = 0; i < 50; i++) {
            military.work();
        }

        System.out.println("Days left after 50 days: " + military.getDaysLeft()); // Should be 130

        // Simulate completing the rest of the service
        while (military.getDaysLeft() > 0) {
            military.work();
        }

        System.out.println("Days left after service complete: " + military.getDaysLeft()); // Should be 0
    }
}
