package OOP3Assignment;

abstract class Shape {

    private String color;

    abstract double Area();

    public void setColor(String c){
        this.color = c;
    }

    public String getColor(){
        return this.color;
    }
}
