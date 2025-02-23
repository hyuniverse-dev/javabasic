package ch08.package1;

public class RecordExample {
    public static void main(String[] args) {
        Admin a1 = new Admin("1", "홍길동");
        Admin a2 = new Admin("1", "홍길동");
        Admin a3 = new Admin("1", "김길동");

        System.out.println("a1.hashCode() = " + a1.hashCode());
        System.out.println("a2.hashCode() = " + a2.hashCode());
        System.out.println("a3.hashCode() = " + a3.hashCode());

        boolean result1 = a1.equals(a2);
        System.out.println("result1 = " + result1);

        boolean result2 = a1.equals(a3);
        System.out.println("result2 = " + result2);

        // 필드 접근도 가능하다.
        a1.id();
        a1.name();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
