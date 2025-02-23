package ch07.sec01;

public class TryWithResourceExample {
    public static void main(String[] args) {

        // try - with - resource 문 (리소스 처리를 위한 예외 방식)
        try (MyResource resource = new MyResource("B 파일")) {
            String data = resource.read1();
            int result = Integer.parseInt(data);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다. = " + e.getMessage());
        }

        System.out.println();

        try (MyResource resource = new MyResource("B파일")) {
            String data = resource.read2();
            int result = Integer.parseInt(data);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다. = " + e.getMessage());
        }

    }
}
