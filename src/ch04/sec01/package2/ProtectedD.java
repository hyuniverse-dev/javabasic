package ch04.sec01.package2;

import ch04.sec01.package1.ProtectedA;

public class ProtectedD extends ProtectedA {
    public ProtectedD() {
        super();
    }

    public void method1() {
        this.field = "New Data"; // ProtectedA 의 필드
        this.method(); // ProtectedA 의 메소드
    }
}
