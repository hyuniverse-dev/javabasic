package ch02.sec01;

public class EmptyStringExample {
    public static void main(String[] args) {
        // 빈 문자열
        //  - null 과는 다릅니다.
        String str1 = "";
        System.out.println(str1.length());

        // 조건문으로 검사하기 (null과 빈문자열이 아닌 경우 모두)
        String str2 = "apple";

        if (str2 != null && !"".equals(str2)) {
            System.out.println(str2);
        }

        if (!"".equals(str2) && str2 != null) {
            System.out.println(str2);
        }
    }
}
