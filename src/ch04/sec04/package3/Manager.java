package ch04.sec04.package3;

public final class Manager extends Person {
    /*
    final 은 더 이상 상속할 수 없다.
    non-sealed 와는 다르게 이후에 추가적인 자식 클래스 생성이 불가능하다.
     */

    @Override
    public void work() {
        System.out.println("관리자로 일을 합니다.");
    }
}
