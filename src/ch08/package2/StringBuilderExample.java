package ch08.package2;

public class StringBuilderExample {
    public static void main(String[] args) {
        /*
        StringBuilder 는 문자열을 더 효율적으로 다룰 수 있도록 도와주는 클래스이다.
         */

        String data = "ABC";
        data += "DEF";
        System.out.println("data = " + data);

        /*
        StringBuilder 클래스의 append() 메소드는 문자열을 추가로 붙여주는 기능이다.
        새로운 문자열 객체를 만들지 않고, 기존 문자열 객체를 활용하기 때문에 메모리 효율이 상대적으로 좋다.
        
        - append: 기존 문자열의 마지막에 새로운 문자열을 추가
        - insert: 기존 문자열에 지정한 위체 새로운 문자열을 추가
        - delete: 선택한 위치에 있는 문자열을 제거
         */
        String data2 = "ABC";
        StringBuilder sb = new StringBuilder();
        data2 = sb.append(data2)
                .append("DEF")
                .insert(3, "Z")
                .delete(3, 5)
                .toString();
        System.out.println("data2 = " + data2); // ABCDEF
    }
}
