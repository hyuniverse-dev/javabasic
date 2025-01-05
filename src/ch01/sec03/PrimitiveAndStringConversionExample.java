package ch01.sec03;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        // 기본형과 문자열의 변환
        String numberStr1 = "10";
        String numberStr2 = "3.14";
        String booleanStr3 = "true";

//        int i = 100 / numberStr1; -> 정수 / 문자열은 연산 불가

        // 래퍼클래스 - 특정 자료형에 필요한 기능 (이후 자세히 학습)
        //  정수 관련된 기능 - Integer 클래스를 사용
        int iValue = Integer.parseInt(numberStr1);
        System.out.println("iValue = " + iValue);

        //  실수 관련된 기능 - Double 클래스를 사용
        double dValue = Double.parseDouble(numberStr2);
        System.out.println("dValue = " + dValue);

        // 불린 관련된 기능 - Boolean 클래스 사용
        boolean bValue = Boolean.parseBoolean(booleanStr3);
        System.out.println("bValue = " + bValue);
    }
}
