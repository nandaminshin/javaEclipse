package OOP4Assignment;

public class  Cube implements Shape {

    private double x;
    private String Name = "Cube";

    public Cube(double x){
        this.x = x;
    }

    public String getName() {
        return this.Name;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return this.x * this.x;
    }

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        return this.x * this.x * this.x;
    }
}
