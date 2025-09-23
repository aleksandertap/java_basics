package week5.Ex88;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        addStudent();
        findStudentWith();
    }

    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("name: ");
            String name = sc.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("studentNumber: ");
            String studentNumber = sc.nextLine();
            Student student = new Student(name, studentNumber);
            list.add(student);
        }
        for(Student Student : list){
            System.out.println(Student);
        }
    }

    public static void findStudentWith(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give search term: ");
        String searchTerm = sc.nextLine();
        System.out.println("Result:");
        for (Student student : list){
            if(student.getName().contains(searchTerm)){
                System.out.println(student);
            }
        }
    }
}
