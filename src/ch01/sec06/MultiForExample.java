package ch01.sec06;

public class MultiForExample {
    public static void main(String[] args) {
        // 중첩 반복문(이중 반복문, 이중 for문, ...)
        //  - 반복문 안에 또 다른 반복문이 중첩해서 존재
        //  - 바깥 반복문(Outer loop)이 1번 반복될 때 안쪽 반복문(Inner loop)은 여러번 반복된다.
        for (int i = 2; i <= 9; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println("=====");
        }

        // 연습 문제
        //  - 위의 구구단을 반대로 출력하세요. (9단 -> 1단, 결과도 9*9 -> 9*1)
        for (int i = 9; i >= 2; i--) {
            System.out.println("i = " + i);
            for (int j = 9; j >= 1; j--) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println("=====");
        }
    }
}
