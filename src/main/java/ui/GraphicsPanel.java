package ui;

import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class GraphicsPanel extends JPanel implements java.lang.Runnable {
    private Line line1;
    private Line line2;
    private Circle circle;

    public GraphicsPanel(){
        line1 = new Line(500,0,500,1000);
        line2 = new Line(0,500,1000,500);
        circle = new Circle(425,425,150,150);
        (new Thread(this)).start();



    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
Graphics2D g2 = (Graphics2D) g;
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(circle);

    }

    public void run() {
        while(true){
            try {
                circle.Move();
                super.repaint();
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
