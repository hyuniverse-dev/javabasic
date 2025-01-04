package ch01.sec03;

public class StringExample {
    public static void main(String[] args) {
        // 문자열 타입
//        char value = "Hello, World"; -> 컴파일 에러 발생
        String value = "Hello, World";
        String name = "홍길동";
        System.out.println("value = " + value);
        System.out.println("name = " + name);

        // 이스케이프
        String value2 = "A\t B\t C\t D";
        System.out.println("value2 = " + value2);

        String value3 = "오늘은 \"자료형\"을 배우는 날입니다";
        System.out.println("value3 = " + value3);

        String value4 = "1번 줄\n2번 줄";
        System.out.println("value4 = " + value4);

        ////////////////// 연습 //////////////////

        // String 타입의 변수 message1 에 [안녕하세요. 저는 00입니다.] 문자열을 대입하세요.
        // 출력하세요.
        String message1 = "안녕하세요. 저는 박현입니다.";
        System.out.println(message1);

        // String 타입의 변수 message2 에 아래의 형식과 동일하게 출력되도록 문자열을 대입하세요.
        /*
            1. 이름
            2. 나이
            3. 이메일 주소
         */
        // 출력하세요.
        String message2 = "1. 이름\n2. 나이\n3. 이메일 주소";
        System.out.println(message2);

        //////////////////////////////////////////

        // 텍스트 블록(Java13+)
        String message3 = """
                1. 이름
                2. 나이
                3. 이메일 주소
                """;
        System.out.println(message3);
    }
}
