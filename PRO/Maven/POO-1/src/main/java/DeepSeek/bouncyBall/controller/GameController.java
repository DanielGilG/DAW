package DeepSeek.bouncyBall.controller;

import DeepSeek.bouncyBall.model.Ball;
import DeepSeek.bouncyBall.view.DrawingPanel;

import java.util.concurrent.TimeUnit;

public class GameController {
    private DrawingPanel drawingPanel;
    private Ball ball;

    public GameController(DrawingPanel drawingPanel, Ball ball){
        this.drawingPanel = drawingPanel;
        this.ball = ball;
        drawingPanel.addDrawable(ball);
    }

    public void startGame() throws InterruptedException {
        while (true){
            ball.move(drawingPanel.getWidth(), drawingPanel.getHeight());
            drawingPanel.repaint(); // Redibuja el panel
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}