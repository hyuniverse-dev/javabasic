package ch01.sec05;

import java.util.Scanner;

public class SwitchExpressionsExample3 {
    public static void main(String[] args) {
        // switch 표현식 연습
        //  회원등급: VIP, GOLD, GENERAL 이 존재
        //  사용자로부터 구매 금액을 입력
        //  구매 금액에 따라서 쿠폰을 지급하고, 회원 등급에 따라서 할인률 적용

        //  쿠폰 지급: 10,000원이상 30,000원미만 구매
        //            -> 1,000원 쿠폰 지급,
        //          : 30,000원이상 50,000원미만 구매
        //            -> 3,000원 쿠폰 지급,
        //          : 50,000원이상 구매
        //            -> 5,000원 쿠폰 지급
        //  할인률: VIP(10%), GOLD(7%), GENERAL(5%) 적용

        // 최종 결제 금액: 지급 받은 쿠폰 + 할인률이 적용된 금액

        // (1) 사용자로부터 구매 금액 입력
        System.out.print("금액을 입력하세요 >>> ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        // (2) 등급은 변수 직접 대입
        String grade = "VIP";

        // (3) if문 사용해서 구매 금액에 따라 쿠폰 지급
        int cupon = 0;

        if (amount >= 10000 && amount < 30000) {
            cupon = 1000;
        } else if (amount >= 30000 && amount < 50000) {
            cupon = 3000;
        } else if (amount >= 50000) {
            cupon = 5000;
        }

        System.out.println(cupon);

        // (4) switch 표현식을 사용해서 쿠폰 금액과 할인률을 적용한 최종 결과를 price 변수에 대입
        double price = switch (grade) {
            case "VIP" -> {
                // 최종 가격을 계산해서 변수에 대입
                yield (amount * 0.9) - cupon;
            }
            case "GOLD" -> {
                yield (amount * 0.93) - cupon;
            }
            case "GENERAL" -> {
                yield (amount * 0.95) - cupon;
            }
            default -> {
                yield amount;
            }
        };

        // (5) price 출력
        System.out.println((int) price);
    }
}
