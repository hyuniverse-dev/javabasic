package ch04.sec04.package3;

public sealed class Person permits Employee, Manager {
    /*
    기본적으로 final 로 선언된 클래스를 제외하고 모든 클래스는 부모 클래스 될 수 있다.
    무분별한 자식 클래스 생성을 방지하기 위해서 봉인된 클래스가 도입됐다. (Java15+)

    관련 키워드: sealed(봉인), permits(허용)
     */


    // 필드
    public String name;

    // 메소드
    public void work() {
        System.out.println("일을 합니다.");
    }
}
