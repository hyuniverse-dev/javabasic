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

    }
}
