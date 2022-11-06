package OOP4Assignment;

public class Circle implements Shape {

    private double radius;
    private String Name = "Circle";

    public Circle(double r) {
        this.radius = r;
    }

    public String getName() {
        return this.Name;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return (22*radius*radius)/7;
    }
    
    @Override
    public double volume() {
        // TODO Auto-generated method stub
        return 0;
    }
}
