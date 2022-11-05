package OOP3Assignment;

public class Demo {
    
    public static void main(String[] args) {

        int i = 0;

        Rectangle [] rObj = new Rectangle[3];

        rObj[0] = new Rectangle(5, 10, "White");
        rObj[1] = new Rectangle(10, 10, "Black");
        rObj[2] = new Rectangle(7, 7, "Red");
        
        for(i = 0 ; i < rObj.length ; i++) {
            rObj[i].Area();
        }

        for(i = 0 ; i < rObj.length ; i++) {
            rObj[i].displayArea();
            System.out.println("__________________________________________");
        }
    }

}
