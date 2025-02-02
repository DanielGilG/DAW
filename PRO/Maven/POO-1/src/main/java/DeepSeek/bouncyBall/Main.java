package DeepSeek.bouncyBall;

import DeepSeek.bouncyBall.controller.GameController;
import DeepSeek.bouncyBall.model.Ball;
import DeepSeek.bouncyBall.view.DrawingPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("sun.java2d.opengl", "true");

        JFrame frame = new JFrame("Pelota Rebotando");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);

        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);

        Ball ball = new Ball(100, 100, 20, 5, 5, Color.RED);
        GameController gameController = new GameController(drawingPanel, ball);

        frame.setVisible(true);
        gameController.startGame();
    }
}
