package ch03.sec02;

public class Earth {
    // 상수 선언 및 초기화
    //  - 상수명: EARTH_RADIUS
    //  - 값: 6400;
    static final int EARTH_RADIUS = 6400;

    // 정적 필드 선언 및 초기화 - static 블록 사용
    //  - 필드명: EARTH_SURFACE
    //  - 값: 4 * 3.14 * 반지름^2
    static final double EARTH_SURFACE;

    static {
        EARTH_SURFACE = 4 * 3.14 * EARTH_RADIUS * EARTH_RADIUS;
    }
}
