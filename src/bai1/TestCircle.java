package bai1;

import javafx.scene.shape.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getRadius();
        System.out.println("ban kinh hinh tron:"+c1.getRadius());
        System.out.println("dien tich hinh tron: "+ c1.getArea());
    }
}
