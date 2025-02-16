package ch05.sec04;

public sealed interface InterfaceA permits InterfaceB {
    /*
    무분별한 인터페이스 생성을 방지하기 위해서 봉인된 인터페이스를 사용한다. (Java15+)

    키워드: sealed, permits, non-sealed
     */
}
