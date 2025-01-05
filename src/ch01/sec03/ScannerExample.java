package ch01.sec03;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner 생성
        Scanner scanner = new Scanner(System.in);

        // 콘솔 뷰에서 값을 입력받기
        System.out.print("값을 입력해주세요 >>> ");
        String value = scanner.nextLine(); // 콘솔 뷰에서 값을 입력하는 기능

        // 입력받은 값에 10을 더한 결과를 출력하기
        //  1. 형 변환 (문자열 -> 정수 데이터로 변환)
        int iValue = Integer.parseInt(value);

        //  2. 10과 더한 결과를 result 변수에 대입
        int result = iValue + 10;

        // 입력받은 값을 출력하기
        System.out.println("result = " + result);
    }
}
