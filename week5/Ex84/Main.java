package week5.Ex84;

public class Main {
    public static void main(String[] args) {
        // Test different constructors
        Counter c1 = new Counter(5, true);   // start 5, check on
        Counter c2 = new Counter(10);        // start 10, check off
        Counter c3 = new Counter(true);      // start 0, check on
        Counter c4 = new Counter();          // start 0, check off

        System.out.println("Initial values:");
        System.out.println("c1: " + c1.value()); // 5
        System.out.println("c2: " + c2.value()); // 10
        System.out.println("c3: " + c3.value()); // 0
        System.out.println("c4: " + c4.value()); // 0
        System.out.println();

        // Test increase and decrease
        c1.increase();
        c2.decrease();
        c3.decrease(); // check is on, stays at 0
        c4.increase(5);

        System.out.println("After some operations:");
        System.out.println("c1 (increase 1): " + c1.value()); // 6
        System.out.println("c2 (decrease 1): " + c2.value()); // 9
        System.out.println("c3 (decrease 1 with check): " + c3.value()); // 0
        System.out.println("c4 (increase 5): " + c4.value()); // 5
        System.out.println();

        // Test decrease with amounts
        c1.decrease(10); // check is on, should stop at 0
        c2.decrease(15); // check is off, goes negative
        c3.increase(3);
        c3.decrease(2);

        System.out.println("After more operations:");
        System.out.println("c1 (decrease 10, check on): " + c1.value()); // 0
        System.out.println("c2 (decrease 15, check off): " + c2.value()); // -6
        System.out.println("c3 (increase 3, decrease 2): " + c3.value()); // 1
        System.out.println("c4: " + c4.value()); // still 5
    }
}
