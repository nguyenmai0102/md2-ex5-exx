package bai1;

import javafx.scene.shape.Circle;

public class circle {
    //. thuc hien
    private double radius;
    private String color;

    // 2 hamf tao
    public Circle(){
        this.radius=1;
        this.color="red";
    }

    public circle(double radious) {
        this.radius = radious;
        this.color = "red";
    }
    //3 phuong thuc


    public double getRadious() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return
                Math.pow(this.radius,2)*Math.PI;
    }
}
