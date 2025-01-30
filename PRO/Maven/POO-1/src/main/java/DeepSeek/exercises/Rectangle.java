package DeepSeek.exercises;

public class Rectangle extends Shape implements Drawable{

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void returnName() {
        System.out.println("Rectangle");
    }

    @Override
    public double calculateArea() {
        double area = base * height;
        return area;
    }
}
