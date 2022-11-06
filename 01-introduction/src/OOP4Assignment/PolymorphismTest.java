package OOP4Assignment;

import java.text.DecimalFormat;

public class PolymorphismTest {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {

        Shape[] shapeObj = new Shape[2];
        shapeObj[0] = new Cube(7.5);
        shapeObj[1] = new Circle(5.2);

        int i;

        for(i = 0 ; i < 2 ; i++) {
            System.out.println("The area of " + shapeObj[i].getName() + " is : " + df.format(shapeObj[i].area()));
            
            System.out.println("The volume of " + shapeObj[i].getName() + " is : " + df.format(shapeObj[i].volume()));
        }

    }

}
// System.out.printf("Value is: %0,10.2f", iLovePie);
// "The area of " + shapeObj[i].getName() + "is : " + shapeObj[i].area()