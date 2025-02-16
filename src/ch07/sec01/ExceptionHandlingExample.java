package ch07.sec01;

public class ExceptionHandlingExample {
    public static void printLength(String str) {
        try {
            int length = str.length();
            System.out.println("문자의 개수 = " + length);
        } catch (NullPointerException e) {
            /*
            예외 정보를 얻는 방법
            1. e.getMessage(): 가장 적은 정보
            2. e.toString(): e.getMessage() + 예외 종류
            3. e.printStackTrace(): 예외의 모든 정보
             */
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("Hello World");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
