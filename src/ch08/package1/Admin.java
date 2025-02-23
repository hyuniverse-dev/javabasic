package ch08.package1;

public record Admin(String id, String name) {
    /*
    일반 클래스에서 재정의했던 Object 클래스의 메소드들
    데이터를 기준으로 동등 비교하도록 자동 재정의
     */
}
