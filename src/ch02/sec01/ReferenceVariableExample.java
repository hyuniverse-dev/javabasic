package ch02.sec01;

public class ReferenceVariableExample {
    public static void main(String[] args) {
        // 참조 타입
        String str1 = new String("자바");
        String str2 = new String("자바");
        String str5 = str1;
        System.out.println(str1 == str2);
        System.out.println(str5 == str2);



        String str3 = "자바";
        String str4 = "자바";
        System.out.println("str3 == str4 = " + (str3 == str4));


    }
}
