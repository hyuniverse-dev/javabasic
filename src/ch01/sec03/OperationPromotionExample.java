package ch01.sec03;

public class OperationPromotionExample {
    public static void main(String[] args) {
        // 연산식에서 자동 타입 변환

        // 정수끼리의 연산은 int 반환
        byte x = 10;
        byte y = 20;
//        byte result = x + y;  -> 컴파일 에러 발생
        int result1 = x + y;
        byte result2 = (byte) (x + y);
        System.out.println("result2 = " + result2);

        byte result3 = 10 + 20;
        System.out.println("result3 = " + result3);

        // 실수끼리의 연산은 해당 type 반환
        float a = 3.14F;
        float b = 0.01F;
        float result4 = a + b;

        // 정수끼리 연산 (int + long)
        int c = 10;
        long d = 20L;
        long result5 = c + d;
        System.out.println("result5 = " + result5);

        // 실수끼리 연산 (float + double)
        float e = 1.2F;
        double f = 2.3;
        double result6 = e + f;
        System.out.println("result6 = " + result6);

        // 정수와 실수의 연산 (int + double)
        int g = 10;
        double h = 2.0;
        double result7 = g + h;
        System.out.println("result7 = " + result7);

        int result8 = g + (int) h;
        System.out.println("result8 = " + result8);

        // 정수 나누기 연산 (int / int)
        int i = 1;
        int j = 2;

        double result9 = i / j; // 0.5
        System.out.println("result9 = " + result9);

        //  방법(1)
        result9 = (double) i / j;
        System.out.println("result9 = " + result9);

        result9 = i / (double) j;
        System.out.println("result9 = " + result9);

        //  방법(2)
        result9 = (double) i / (double) j;
        System.out.println("result9 = " + result9);
    }
}
