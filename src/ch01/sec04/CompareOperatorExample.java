package ch01.sec04;

public class CompareOperatorExample {
    public static void main(String[] args) {
        // 비교 연산자
        //  종류(1) 동등비교
        //      == (같다), != (같지 않다)
        int a = 10;
        int b = 10;
        boolean isEqual = a == b;
        System.out.println("isEqual = " + isEqual);

        isEqual = a != b;
        System.out.println("isEqual = " + isEqual);

        // 종류(2) 크기비교
        //      >(크다), >=(크거나 같다), <(작다), <=(작거나 같다)
        boolean isGreater = a > b;
        System.out.println("isGreater = " + isGreater);

        boolean isGreaterOrEqual = a >= b;
        System.out.println("isGreaterOrEqual = " + isGreaterOrEqual);

        boolean isLess = a < b;
        System.out.println("isLess = " + isLess);

        boolean isLessOrEqual = a <= b;
        System.out.println("isLessOrEqual = " + isLessOrEqual);

        // 서로 다른 자료형 크기비교
        isEqual = 3 == 3.0;
        System.out.println("isEqual = " + isEqual);

        float fValue = 0.1F;
        double dValue = 0.1;
        isEqual = fValue == (float) dValue;
        System.out.println("isEqual = " + isEqual);

        // 문자열 비교
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        isEqual = str1 == str2;
        System.out.println("isEqual = " + isEqual);

        isEqual = str1 == str3; // 문자열 비교는 동등연산을 사용하지 않는다.
        System.out.println("isEqual = " + isEqual);

        isEqual = str1.equals(str3); // 문자열 비교는 .equals() 를 사용한다.
        System.out.println("isEqual = " + isEqual);
    }
}








