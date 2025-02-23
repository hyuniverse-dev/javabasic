package ch10.sec01;

import java.awt.*;

public class PrintBeepExample2 {
    public static void main(String[] args) {
        // PrintBeepExample 을 멀티 스레드로 구현

        int millis = 1000;
        int stop = millis * 5;

        // 비프음을 실행하는 작업 스레드 생성
        Thread threadA = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        Toolkit toolkit = Toolkit.getDefaultToolkit();
                        for (int i = 0; i < 5; i++) {
                            toolkit.beep();
                            try {
                                Thread.sleep(stop);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        );

        threadA.start();

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
