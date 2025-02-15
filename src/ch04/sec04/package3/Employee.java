package ch04.sec04.package3;

public non-sealed class Employee extends Person {
    /*
    non-sealed 는 봉인을 해제한다는 뜻이다.
    따라서 봉인된 부모 클래스를 상속받은 후에 non-sealed 하면 Employee 는 자식 클래스를
    자유롭게 만들 수 있다.
     */

    @Override
    public void work() {
        System.out.println("직원으로 일을 합니다.");
    }
}
