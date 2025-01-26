package ch02.sec02;

public class EnumExample2 {
    public static void main(String[] args) {
        // 현재 누적 구매 금액을 기준으로 회원 등급 분기하기
        int member1 = 100000;
        int member2 = 50000;

        // 배열 활용
        int[] members = {member1, member2};

        // 등급 구간
        //  - 10000원 미만: GENERAL
        //  - 10000원 이상: SILVER
        //  - 30000원 이상: GOLD
        //  - 40000원 이상: VIP
        //  - 70000원 이상: VVIP
        MemberGrade grade;
        int count = 1;
        for (int member : members) {
            if (member >= 70000) {
                grade = MemberGrade.VVIP;
            } else if (member >= 40000) {
                grade = MemberGrade.VIP;
            } else if (member >= 30000) {
                grade = MemberGrade.GOLD;
            } else if (member >= 10000) {
                grade = MemberGrade.SILVER;
            } else {
                grade = MemberGrade.GENERAL;
            }
            System.out.println("member" + count + " 회원의 등급은 = " + grade);
            count++;
        }
    }
}
