package ch04.sec01.package1;

public class ProtectedC {
    public void method() {
        ProtectedA a = new ProtectedA("Data");
        String data = a.field;
        System.out.println("data = " + data);

        a.method();
    }

    public static void main(String[] args) {
        ProtectedC c = new ProtectedC();
        c.method();
    }
}
