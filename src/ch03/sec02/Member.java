package ch03.sec02;

public class Member {
    static final String NATION = "대한민국"; // 상수 (값 불변, 전체 공유)
                                           // 상수는 반드시 모두 대문자로 작성한다.
                                           // 두 단어 이상 사용시 _(언더바)로 글자를 이어준다. (예시: NATION_NAME)
    final String ssn; // 멤버별 주민등록번호

    public Member(String ssn) {
        this.ssn = ssn;
    }
}
