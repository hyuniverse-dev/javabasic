package ch01.sec05;

import java.util.Scanner;

public class SwitchExpressionsExample2 {
    public static void main(String[] args) {
        // switch 표현식 응용

        //  쇼핑몰의 회원 등급에 따라 할인률 적용하기
        System.out.print("구매 금액을 입력하세요 >>> ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt(); // 구매 금액

        // 할인률: VIP(10%), GOLD(7%), GENERAL(5%)
        String grade = "GOLD";
        // 방법(1) switch문에서 할인률 데이터만 반환
        double rate = switch (grade) {
            case "VIP" -> 0.1;
            case "GOLD" -> 0.07;
            case "GENERAL" -> 0.05;
            default -> 0.0;
        };
        double price = amount - (amount * rate); // 실제 결제할 금액(할인률 적용 금액)
        System.out.println(price);

        // 방법(2) switch문에서 price를 계산한 데이터를 반환
        double price2 = switch (grade) {
            case "VIP" -> {
                yield amount * 0.9;
            }
            case "GOLD" -> {
                yield amount * 0.93;
            }
            case "GENERAL" -> {
                yield amount * 0.95;
            }
            default -> {
                yield amount;
            }
        };

        System.out.println(price2);


    }
}
