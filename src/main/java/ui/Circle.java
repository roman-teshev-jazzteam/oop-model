package ui;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Ellipse2D {
    private Point point;
    private Point centerPoint;
    private double height;
    private double width;
    private double x0;
    private double y0;
    private double radius = 300.0;
    private double angle = 6.0;
    private double i = 0;

    public Circle(double x, double y, double width, double height) {
        point = new Point(x, y);
        centerPoint = new Point(425,425);
        this.width = width;
        this.height = height;
        x0 = centerPoint.getX();
        y0 = centerPoint.getY();

    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double width, double height) {
        point.setLocation(x, y);
        this.width = width;
        this.height = height;

    }

    public Rectangle2D getBounds2D() {
        return null;
    }

    public void Move() {
        if(i * angle > 360) i= 0;
        else i+=0.0009;
        double newX = x0 + radius*Math.cos(i * angle);
        double newY = y0 + radius*Math.sin(i * angle);
        this.setFrame(newX,newY,width,height);

    }
}
