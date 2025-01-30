package DeepSeek.exercises;

public class Circle extends Shape implements Drawable{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void returnName() {
        System.out.println("Circle");
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}