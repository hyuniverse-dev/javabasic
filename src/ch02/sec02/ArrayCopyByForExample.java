package ch02.sec02;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        // 배열 복사
        int[] oldIntArry = {1, 2, 3};

        // 길이 5인 newArry에 복사하기
        int[] newIntArry = new int[5];

        // for문을 이용하여 배열 복사
        for (int i = 0; i < oldIntArry.length; i++) {
            newIntArry[i] = oldIntArry[i];
        }

        oldIntArry[0] = 10;

        // newIntArry 출력
        for (int i = 0; i < newIntArry.length; i++) {
            System.out.println(newIntArry[i]);
        }

        // 메소드 사용(1) - arraycopy()
        int[] newIntArry2 = new int[5];
        System.arraycopy(oldIntArry, 0, newIntArry2, 0, oldIntArry.length);

        // newIntArry2 출력
        for (int i = 0; i < newIntArry2.length; i++) {
            System.out.println(newIntArry2[i]);
        }

        // 향상된 for문으로 배열 순회하기
        // 향상된 for문 shortcut = "iter" 를 입력하면 자동으로 구조가 완성된다.
        System.out.println("===== 향상된 for문 =====");
        for (int number : newIntArry2) { // newIntArry2 = {10, 2, 3, 0, 0}
            System.out.println(number);
        }

        // 향상된 for문으로 newIntArry2의 총합과 평균을 출력하기
        int sum = 0;
        for (int number : newIntArry2) {
            sum += number;
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + ((double) sum / newIntArry2.length));
    }
}
