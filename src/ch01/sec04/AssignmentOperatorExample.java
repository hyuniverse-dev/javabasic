package ch01.sec04;

import java.util.Scanner;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        // 복합대입연산자, 삼항연산자

        // 복합대입연산자: 산술연산자 + 대입연산자
        int number1 = 10;
        number1++; // 값을 1 증가(감소) number = number + 1;

        int number2 = 10;
        number2 += 1; // number2 = number2 + 1;
        System.out.println("number2 = " + number2);

        number2 += 10; // number2 = number2 + 10;
        System.out.println("number2 = " + number2);

        number2 -= 10; // number2 = number2 - 10;
        System.out.println("number2 = " + number2);

        number2 *= 10; // number2 = number2 * 10;
        System.out.println("number2 = " + number2);

        number2 /= 2; // number2 = number2 / 2;
        System.out.println("number2 = " + number2);

        //  삼항연산자
        //      총 3개의 피연산자를 가지고 연산한다.
        //      형식: 피연산자1 ? 피연산자2 : 피연산자3
        //           - 피연산자1 이 true 이면 피연산자2 를 대입
        //           - 피연산자1 이 false 이면 피연산자3 을 대입
        int age = 20;
        boolean isAdult = age >= 19 ? true : false;
        System.out.println("isAdult = " + isAdult);

        String message = age >= 19 ? "성인입니다." : "성인이 아닙니다.";
        System.out.println(message);

        // 사용자로부터 입력을 받는다. (Scanner 생성)
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 >>> ");
        String value = scanner.nextLine();

        // 입력받은 문자열이 "Hello"와 같은지 비교 후
        boolean isEqual = value.equals("Hello");

        // 같으면 "동일한 문자열입니다." 출력, 같지 않으면 "동일하지 않은 문자열입니다."
        message = isEqual ? "동일한 문자열입니다." : "동일하지 않은 문자열입니다.";
        System.out.println(message);
    }
}
