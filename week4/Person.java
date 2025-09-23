package week4;

public class Person {
    private final String name;
    private final int age;

    public Person(String name) {
        this.name = name;
        this.age= 0;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
