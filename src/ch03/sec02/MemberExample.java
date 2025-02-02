package ch03.sec02;

public class MemberExample {
    public static void main(String[] args) {
        // 멤버 객체 생성
        Member member = new Member("010202-3012345");
        // member.ssn = "010202-4012345"; -> final 필드이기 때문에 최초 값을 변경 할 수 없다.

        String nation = Member.NATION;
        System.out.println("nation = " + nation);
    }
}
