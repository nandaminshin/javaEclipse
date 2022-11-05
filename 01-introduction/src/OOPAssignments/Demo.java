package OOPAssignments;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        int x;
        boolean isStdHere = false;
        int max;
        int a, b;
        int maxIndex = 0;
        int total = 0;
        float average = 0.00f;

        Student stdObj[] = new Student[4];

        int i = 0;

        // Section A
        stdObj[0] = new Student(7, "Kyaw Kyaw", 80);
        stdObj[1] = new Student(27, "Aung Aung", 60);
        stdObj[2] = new Student(77, "Mya Mya", 90);
        stdObj[3] = new Student(16, "Su Su", 100);

        // Section B (This section is to request user input while running the program.If
        // you want to use this, uncomment this section and comment section A)
        // for (i = 0; i < stdObj.length; i++) {
        // stdObj[i] = new Student();
        // }

        for (i = 0; i < stdObj.length; i++) {
            stdObj[i].display(i + 1);

            System.out.println("__________________________");

        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID you want to search : ");
        int key = sc.nextInt();

        for (i = 0; i < stdObj.length; i++) {
            x = stdObj[i].getId();
            if (x == key) {
                stdObj[i].display(i + 1);
                System.out.println("\n");
                isStdHere = true;
            }
        }

        if (isStdHere == false) {
            System.out.println("Student id - " + key + " is not found!");
            System.out.println("\n");
        }

        a = stdObj[0].getMark();
        max = a;
        for (i = 1; i < stdObj.length; i++) {
            b = stdObj[i].getMark();
            if (b > a) {
                max = b;
                maxIndex = i;
            }
        }

        System.out.println("Student with highest mark is " + stdObj[maxIndex].getName());
        System.out.println("\n");

        total += stdObj[0].getMark();
        for (i = 1; i < stdObj.length; i++) {
            total += stdObj[i].getMark();
        }

        average = total / stdObj.length;
        System.out.print("The average mark is ");
        System.out.printf("%.2f", average);
    }

}
