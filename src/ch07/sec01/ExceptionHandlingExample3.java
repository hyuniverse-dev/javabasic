package ch07.sec01;

public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        // 리소스 자동 닫기
        //  - 리소스는 데이터를 제공하는 객체이다. 파일을 열거나 닫거나 할때 사용하는 객체이다.
        //  - 비정상적으로 프로그램이 종료되거나 혹은 정상적인 처리가 되지 않으면 리소스 해제가 안된다.
        //  - 리소스를 사용하다가 예외가 발생해도 안전하게 닫아주는 처리가 필요하다.

        MyResource resource = new MyResource("A 파일");

        // 정상적으로 종료된 경우
        try {
            String result1 = resource.read1();
            int intResult1 = Integer.parseInt(result1);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다. = " + e.getMessage());
        } finally {
            // try 블록의 예외 여부와 상관없이 반드시 실행되는 블록
            System.out.println("파일을 닫았습니다.");
        }

        // 비정상적으로 종료된 경우
        try {
            String result2 = resource.read2();
            int intResult2 = Integer.parseInt(result2);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다. = " + e.getMessage());
        } finally {
            // try 블록의 예외 여부와 상관없이 반드시 실행되는 블록
            System.out.println("파일을 닫았습니다.");
        }


    }
}
