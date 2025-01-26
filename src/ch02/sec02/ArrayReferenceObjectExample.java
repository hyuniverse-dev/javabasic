package ch02.sec02;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        // 객체를 참조하는 배열
        String[] strArry = new String[3];
        strArry[0] = "Java";
        strArry[1] = "Java";
        strArry[2] = new String("Java");

        System.out.println(strArry[0] == strArry[2]); // false 반환: 참조주소가 다르다.
        System.out.println(strArry[0].equals(strArry[2])); // true 반환: 문자열 패턴으로 검사한다.
    }
}
