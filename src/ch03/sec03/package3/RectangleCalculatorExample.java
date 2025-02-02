package ch03.sec03.package3;

public class RectangleCalculatorExample {
    public static void main(String[] args) {

        RectangleCalculator cal = new RectangleCalculator();

        // 정사각형 넓이 대입하기
        cal.setArea(10);

        // 넓이 출력
        double area = cal.getArea();
        System.out.println("area = " + area);

        // 직사각형 넓이 대입하기
        cal.setArea(10, 20);

        // 넓이 출력
        area = cal.getArea();
        System.out.println("area = " + area);
    }
}
