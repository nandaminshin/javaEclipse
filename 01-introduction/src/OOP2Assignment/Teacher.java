package OOP2Assignment;

import java.util.Scanner;

public class Teacher extends Person {

    private String position;
    private String department;
    private int salary;

    public Teacher(String pos, String dep, int sal , String n , String nn , String ad, String ph) {
        super(n, nn, ad, ph);
        this.position = pos;
        this.department = dep;
        this.salary = sal;
    }

    public void setTeacherIfo() {
        setInfo();
        System.out.println("Enter position : ");
        this.position = sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter department : ");
        this.department = sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter salary : ");
        this.salary = sc.nextInt();
        System.out.println("\n");
    }

    public void promote(String pos, int sal) {
        this.position = pos;
        this.salary = sal;
    }

    public void transfer(String dep) {
        this.department = dep;
    }

    public void showTeacherInfo() {
        showInfo();
        showIdentificationInfo();
        System.out.println("This person is a teacher.");
        System.out.println("POSITION : " + this.position);
        System.out.println("DEPARTMENT : " + this.department);
        System.out.println("SALARY : " + this.salary);
    }

    public void showOnlyTeacherInfo() {
        System.out.println("POSITION : " + this.position);
        System.out.println("DEPARTMENT : " + this.department);
        System.out.println("SALARY : " + this.salary);
    }
}