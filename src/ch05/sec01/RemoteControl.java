package ch05.sec01;

public interface RemoteControl {
    /*
    인터페이스는 접속기이다. (본체 <-> 단자 <-> 모니터)
    물리적인 형태는 *.java 형태의 소스 파일로 작성되고 *.class 형태로 컴파일 된다. (클래스랑 동일하다.)
    class 키워드 대신 interface 키워드 사용한다.
    사용 가능한 접근 제한자는 default, public 만 사용이 가능하다.
     */

    /*
    인터페이스 멤버로 올 수 있는 종류는 다음과 같다.
    1. public 상수 필드
    2. public 추상 메소드: 추상 메소드란 선언부(메소드 시그니처)만 있고, 구현부(실행부)인 중괄호가 없는 메소드이다.
    3. public 디폴드 메소드
    4. public 정적 메소드
    5. private 메소드
    6. private 정적 메소드
     */

    public void turnOn(); // 추상 메소드
}
