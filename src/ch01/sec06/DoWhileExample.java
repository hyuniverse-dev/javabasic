package ch01.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        // do~while문
        //  - while문은 주어진 조건이 true인 경우에만 반복을 실행한다.
        //  - 따라서 while문은 한 번도 실행이 안될 수도 있다.
        //  - do~while문은 한 번은 실행은 보장한다.


        // while문과 do~while문 차이 예시
        //  - while문
        //  - 사용자로부터 입력을 받아서 "q" 문자가 아니면 반복 실행
        //    "q" 문자를 입력 받으면 반복을 종료

        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요(while문) >>> ");
        String userInput = scanner.nextLine();
        while (!userInput.equals("q")) {
            System.out.println("userInput = " + userInput);
            userInput = scanner.nextLine();
        }

        String userInput2 = "";
        do {
            System.out.println("문자열을 입력하세요(do~while문) >>> ");
            Scanner scanner2 = new Scanner(System.in);
            userInput2 = scanner2.nextLine();
            System.out.println("userInput2 = " + userInput2);
            // 실행 코드
        } while (!userInput2.equals("q")/*조건식*/);


    }
}
