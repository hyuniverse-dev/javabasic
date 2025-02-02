package ch03.sec01;

public class RectangleCalculatorExample {
    public static void main(String[] args) {
        // 객체 생성
        RectangleCalculator cal = new RectangleCalculator();

        // 정사각형의 넓이
        int area1 = cal.getArea(5);
        System.out.println("area1 = " + area1);

        // 직사각형의 넓이
        int area2 = cal.getArea(5, 6);
        System.out.println("area2 = " + area2);
        
    }
}
