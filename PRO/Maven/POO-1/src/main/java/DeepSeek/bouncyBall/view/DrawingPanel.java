package DeepSeek.bouncyBall.view;

import DeepSeek.bouncyBall.interfaces.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {
    private List<Drawable> drawables = new ArrayList<>();

    public void addDrawable(Drawable drawable){
        drawables.add(drawable);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Drawable drawable : drawables) {
            drawable.draw(g);
        }
    }
}