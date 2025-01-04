package ch01.sec03;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        // 정수 타입
        //   - byte(1), short(2), char(2), int(4), long(8)

        // 1. byte와 short
        short number1 = 127;
        System.out.println(number1);

        number1 = 128;
        System.out.println(number1);

        // 2. char
        char number2 = 65;
        System.out.println(number2);
        char character1 = 'A';
        //  - char 타입 주의사항: 문자 한 개만 저장 가능, 초기화 시에 최소 1개의 문자 기호 필요
//        char character2 = 'ABC';
//        char character3 = ' ';
        

        // 3. int와 long
        int number3 = 2147483647;
        long number4 = 2147483648L;
        System.out.println(number4);
    }
}
