package OOP3Assignment;

public class Rectangle extends Shape {

    private int Length;
    private int width;
    double calculatedArea = 0;

    public Rectangle(int l , int w , String c){
        setColor(c);
        this.Length = l;
        this.width = w;

    }

    @Override
    public double Area() {
        calculatedArea = this.Length * this.width;
        return calculatedArea;
    }

    public void displayArea() {
        System.out.println("The area of the " + this.getColor() + " rectangle is " + calculatedArea);
    }
}