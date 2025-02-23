package ch10.sec01;

import ch05.sec03.E;

import java.awt.*;

public class PrintBeepExample {
    public static void main(String[] args) {
        // 1초 마다 비프음 + "띵~" 소리와 출력문을 동시에 작업

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 비프음 발생
            try {
                Thread.sleep(1000); // 1초간 대기
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵~");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
