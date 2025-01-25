package ch02.sec01;

public class StringExample {
    public static void main(String[] args) {
        // 문자열 데이터 다루기

        // (1) equals(), length() .. 앞의 단원 참고

        // (2) charAt()
        //      - 문자열 데이터의 특정 위치의 글자를 반환
        //      - 괄호() 안에 내가 원하는 위치를 지정(0부터 시작)
        String ssn = "010624-4230123";
        char cValue = ssn.charAt(4);
        System.out.println("cValue = " + cValue);

        // (2-1) charAt()으로 성별 판별하기
        char gender = ssn.charAt(7);

        //      - gender의 값이 '1' 또는 '3'이면 "남자입니다." 출력
        //      - gender의 값이 '2' 또는 '4'이면 "여자입니다." 출력
        if (gender == '1' || gender == '3') {
            System.out.println("남자입니다.");
        } else if (gender == '2' || gender == '4') {
            System.out.println("여자입니다.");
        }

        switch (gender) {
            case '1', '3' -> System.out.println("남자입니다.");
            case '2', '4' -> System.out.println("여자입니다.");
        }

        // (3) 문자열 대치 - replace()
        //      - 문자열에서 특정 문자열을 다른 문자열로 대체
        //      - 010-1234-1234 -> 01012341234 ("-"를 ""로 변환)
        String oldStr = "010-1234-1234";
        String newStr = oldStr.replace("-", "");
        System.out.println("newStr = " + newStr);

        // "자바" 문자열을 "Java"로 대치후 대치된 문자열 출력
        String oldStr2 = "자바 프로그래밍";
        String newStr2 = oldStr2.replace("자바", "Java");
        System.out.println("newStr2 = " + newStr2);


        // (4) 문자열 위치 찾기 - indexOf()
        //      - 문자열에서 특정 문자열의 위치를 찾고자 할 때 사용
        //      - 해당 문자열이 시작되는 인덱스(위치)를 반환
        //      - 만약 해당 문자열이 존재하지 않으면 -1 을 반환
        ssn = "250225-12345678";
        int index = ssn.indexOf("1");
        System.out.println("index = " + index);

        String subject = "자바 프로그래밍";
        index = subject.indexOf("프로그래밍");
        System.out.println("index = " + index);

        index = subject.indexOf("Java");
        System.out.println("index = " + index);

        if (subject.indexOf("Java") == -1) {
            System.out.println("문자열이 존재하지 않습니다.");
        } else {
            System.out.println("문자열이 존재합니다.");
        }

        //      - 주민등록번호 남/녀 판별하기(2) - indexOf() 사용
        String ssn2 = "250125-1011111";
        int dashIndex = ssn2.indexOf("-");
        System.out.println("dashIndex = " + dashIndex);

        int gender2 = ssn2.charAt(dashIndex + 1);
        switch (gender2) {
            case '1', '3' -> System.out.println("남자입니다.");
            case '2', '4' -> System.out.println("여자입니다.");
        }


        // (5) 구분자로 문자열 분리 - split()
        //      - 구분자는 데이터와 데이터 사이를 구분하는 기호
        //      - 대표적으로 CSV(콤마로 데이터가 분리된 형식) 파일 형식을 의미
        String board = "번호,제목,내용,성명";
        String[] arr = board.split(",");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String phone = "010-1234-5678";
        String[] arr2 = phone.split("-");
        System.out.println(arr2[2]);

        String str = "1/2/3/4/5";
        String[] arr3 = str.split("/");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
