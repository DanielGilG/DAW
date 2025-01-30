package DeepSeek.exercises;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        Rectangle r1 = new Rectangle(3, 6);

        c1.draw();
        System.out.println(c1.calculateArea());
        r1.draw();
        System.out.println(r1.calculateArea());
    }
}