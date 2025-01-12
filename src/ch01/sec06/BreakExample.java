package ch01.sec06;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        // break 명령문
        Scanner scanner = new Scanner(System.in);
        while (true /*무한 루프*/) {
            System.out.print("문자열을 입력하세요 >>> ");
            String userInput = scanner.nextLine();

            if (userInput.equals("q")) {
                break;
            }

            System.out.println("userInput = " + userInput);
        }

        // break 범위
        //  - break가 포함되어 있는 while문에만 적용

        Outer:
        // 레이블 처리를 하면 지정된 레이블까지 모두 빠져나온다.
        while (true) {
            System.out.println("바깥쪽 while 문");

            while (true) {
                System.out.println("안쪽 while 문");
                String userInput = scanner.nextLine();
                if (userInput.equals("q")) {
                    break Outer;
                }
            }

        }
    }
}
