package ch09.sec01;

public class Box<T> {
    /*
    타입 파라미터 작성법
    타입 파라미터의 T는 단지 이름일 뿐이다. 따라서 T 대신 A-Z까지 어떤 알파벳을 사용해도
    무관하다. 단, 관례적으로 대문자를 사용한다.

    클래스 또는 인터페이스를 타입 파라미터로 지정해줄 수 있다. 기본형은 불가능하다.
     */

    public T content;
}
