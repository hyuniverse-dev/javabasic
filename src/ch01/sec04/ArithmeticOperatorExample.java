package ch01.sec04;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        // 산술 연산자
        //  +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)

        // 산술 연산 특징
        //  1. 피연산자가 정수 타입(byte, short, int, long)인 경우는 연산의 결과 int 반환
        //  2. 피연산자가 정수 타입 + 서로 다른 타입인 경우인 경우는 연산의 결과 큰 자료형 반환 (int + long -> long)
        //  3. 피연산자 중 하나가 실수 타입이면 연산의 결과 실수 자료형 반환 (double + int -> double)

        int number1 = 10;
        int number2 = 3;
        
        int result = number1 % number2;
        System.out.println("result = " + result);
        
        int result2 = number1 / number2;
        System.out.println("result2 = " + result2);

        // 위 예시를 실수로 출력
        double result3 = (double) number1 / number2;
        System.out.println("result3 = " + result3);

        int result4 = number1 * number2;
        System.out.println("result4 = " + result4);
    }
}
