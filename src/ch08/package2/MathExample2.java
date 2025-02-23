package ch08.package2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MathExample2 {
    public static void main(String[] args) {
        /*
        Math 모듈에서 random() 메소드는 0.0과 1.0 사이의 double 타입 난수를 리턴한다.
         */
        double r = Math.random();
        System.out.println("r = " + r);

        System.out.println();

        // 정수 6개를 담을 수 있는 배열
        int[] numbers = new int[6];

        Random random = new Random(3);// 현재 시간을 이용해서 종자값을 자동으로 설정한다. seed 가 필요하면 정수를 매개 값으로 넘겨준다.

        // 구매자가 선택한 로또 번호 6개
        for (int i = 0; i < 6; i++) {
            int randomValue = random.nextInt(45) + 1;// nextInt() 바운드 매개값을 기준으로 0 ~ n-1 까지의 정수를 반환한다.
            numbers[i] = randomValue;
        }

        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        System.out.println();

        random = new Random(3);

        int[] winnings = new int[6];
        // 추첨된 로또 번호 6개
        for (int i = 0; i < 6; i++) {
            int randomValue = random.nextInt(45) + 1;// nextInt() 바운드 매개값을 기준으로 0 ~ n-1 까지의 정수를 반환한다.
            winnings[i] = randomValue;
        }

        for (int number : winnings) {
            System.out.println("number = " + number);
        }

        // 구매 번호와 추첨 번호 비교해서 2개 이상 동일하면 당첨 처리 - 같이
        System.out.println();
        Arrays.sort(numbers); // numbers 배열을 오름차순 정렬
        Arrays.sort(winnings); // winnings 배열을 오름차순 정렬
        boolean result = Arrays.equals(numbers, winnings); // 정렬된 두 배열을 비교

        if (result) {
            System.out.println("1등 당첨 되셨습니다!");
        } else {
            System.out.println("당첨 되지 않으셨습니다!");
        }

    }
}
