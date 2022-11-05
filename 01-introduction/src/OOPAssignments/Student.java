package OOPAssignments;

import java.util.Scanner;

public class Student {

    private int stdId;
    private String name;
    private int mark;

    Student() {
        setInfo();
    }

    Student(int id, String n, int m) {
        this.stdId = id;
        this.name = n;
        this.mark = m;
    }

    public int getId() {
        return this.stdId;
    }

    public String getName() {
        return this.name;
    }

    public int getMark() {
        return this.mark;
    }

    Scanner sc = new Scanner(System.in);

    public void setInfo() {

        System.out.println("Enter Student ID : ");
        this.stdId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Student name : ");
        this.name = sc.nextLine();

        System.out.println("Enter Student mark : ");
        this.mark = sc.nextInt();

        System.out.println("\n");
    }

    public void display(int num) {

        System.out.println("Student " + num + " ID is " + this.stdId);
        System.out.println("Student " + num + " name is " + this.name);
        System.out.println("Student " + num + " mark is " + this.mark);
    }

}
