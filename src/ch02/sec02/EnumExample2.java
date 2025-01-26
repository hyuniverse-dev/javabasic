package ch02.sec02;

public class EnumExample2 {
    public static void main(String[] args) {
        // 현재 누적 구매 금액을 기준으로 회원 등급 분기하기
        int member1 = 100000;
        int member2 = 50000;
        
        // 등급 구간
        //  - 10000원 미만: GENERAL
        //  - 10000원 이상: SILVER
        //  - 30000원 이상: GOLD
        //  - 40000원 이상: VIP
        //  - 70000원 이상: VVIP
        
        // 각 member 등급을 Enum 타입을 사용해서 출력
    }
}
