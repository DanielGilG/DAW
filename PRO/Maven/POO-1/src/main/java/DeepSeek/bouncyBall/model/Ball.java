package DeepSeek.bouncyBall.model;

import DeepSeek.bouncyBall.interfaces.Drawable;

import java.awt.*;

public class Ball implements Drawable {
    private int x;
    private int y;
    private int radius;
    private int dx;
    private int dy;
    private Color color;

    public Ball(int x, int y, int radius, int dx, int dy, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
        this.color = color;
    }

    public void move(int width, int height){
        x += dx;
        y += dy;

        // Rebotar en los bordes
        if (x - radius < 0 || x + radius > width) {
            dx = -dx;
        }
        if (y - radius < 0 || y + radius > height) {
            dy = -dy;
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
