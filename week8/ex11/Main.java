package week8.ex11;

public class Main {
    public static void main(String[] args) {
        Box bigBox = new Box(100);

        // 1. Create a small box (capacity 5 kg) and put items in it
        Box smallBox = new Box(5);
        smallBox.add(new Book("J.R.R. Tolkien", "The Hobbit", 1.5));
        smallBox.add(new CD("The Beatles", "Abbey Road", 1994));

        System.out.println("Small Box Weight: " + smallBox.weight() + " kg"); // Expected: 1.6 kg

        // 2. Put the small box and other items into the big box
        bigBox.add(smallBox);
        bigBox.add(new Book("Robert Martin", "Clean Code", 1.0));

        // 3. Create a medium box (capacity 10 kg)
        Box mediumBox = new Box(10);
        mediumBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 42));

        // 4. Put the medium box into the big box
        bigBox.add(mediumBox);

        System.out.println("\n--- Final Box Contents ---");
        System.out.println(smallBox);
        System.out.println(mediumBox);
        System.out.println(bigBox);

        // Expected total weight: 1.6 (small box) + 1.0 (Clean Code) + 0.1 (medium box) = 2.7 kg
    }
}
