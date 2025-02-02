package ch02.sec02;

public enum Week { // 열거타입 이름
    // 열거 상수 - 제한된 값들
    //  컨벤션(1) - 자무조건 대문로 작성
    //  컨벤션(2) - 열거 상수가 두 단어 이상 조합되면 모두 대문자 + '_' -> LOGIN_SUCCESS, LOGIN_FAILED
    MONDAY("월요일", 1),
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 7);

    private final String koreanName;
    private final int weekNumber;

    Week(String koreanName, int weekNumber) {
        this.koreanName = koreanName;
        this.weekNumber = weekNumber;
    }

    public String getKoreanName() {
        return this.koreanName;
    }

}
