package ch03.sec01;

public class RectangleCalculator {
    // 정사각형의 넓이를 구하는 메소드
    int getArea(int width) {
        return width * width;
    }

    // 직사각형의 넓이를 구하는 메소드
    int getArea(int width, int height) {
        return width * height;
    }
}
