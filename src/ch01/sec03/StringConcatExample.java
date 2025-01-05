package ch01.sec03;

public class StringConcatExample {
    public static void main(String[] args) {
        // 연산식에서 자동 타입 변환 - 문자열

        // 숫자(정수와 실수 모두 포함) + 문자열
        int iValue = 3 + 7;
        System.out.println("iValue = " + iValue);

        String sValue1 = "3" + 7;
        System.out.println("sValue1 = " + sValue1);

        String sValue2 = 7 + "3";
        System.out.println("sValue2 = " + sValue2);

        // + 연산이 이어지는 케이스
        int iValue2 = 1 + 2 + 3;
        System.out.println("iValue2 = " + iValue2);

        String sValue3 = 1 + 2 + "3";
        System.out.println("sValue3 = " + sValue3);

        String sValue4 = 1 + "2" + 3;
        System.out.println("sValue4 = " + sValue4);

        // 연산의 우선순위 정하기
        //  "1" + 2 + 3 의 결과를 15가 나오도록
        String sValue5 = "1" + (2 + 3);
        System.out.println("sValue5 = " + sValue5);
    }
}
