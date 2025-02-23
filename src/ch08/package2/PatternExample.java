package ch08.package2;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        /*
        정규 표현식(Regular Expression)
        문자열이 정해져 있는 형식으로 구성되어 있는지 검증할 때 사용한다. 예를 들어, 전화번호/비밀번호/이메일 형식 등...
         */

        String pattern = "(02|010|031)-\\d{3,4}-\\d{4}";
        String data = "031-123-4567";

        // 정규 표현식으로 매칭
        boolean result = Pattern.matches(pattern, data);
        if (result) {
            System.out.println("올바른 형식입니다.");
        } else {
            System.out.println("올바르지 않은 전화번호 형식입니다.");
        }

        String pattern2 = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
        String data2 = "noah@email.com";

        boolean result2 = Pattern.matches(pattern2, data2);

        if (result2) {
            System.out.println("올바른 이메일 형식입니다.");
        } else {
            System.out.println("올바르지 않은 이메일 형식입니다.");
        }


    }

}
