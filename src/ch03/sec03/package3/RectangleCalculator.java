package ch03.sec03.package3;

public class RectangleCalculator {
    private double area;

    // 정사각형 넓이를 대입하는 Setter (음수일 경우 면적 0으로 처리)
    public void setArea(double length) {
        if (length > 0) {
            this.area = length * length;
            return;
        }
        this.area = 0;
    }

    // 직사각형 넓이를 대입하는 Setter (음수일 경우 면적 0으로 처리)
    public void setArea(double width, double height) {
        if (width >= 0 && height >= 0) {
            this.area = width * height;
            return;
        }
        this.area = 0;
    }

    // 해당 사각형의 넓이를 반환하는 Getter
    public double getArea() {
        return this.area;
    }
}
