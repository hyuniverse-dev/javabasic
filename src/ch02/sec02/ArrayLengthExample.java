package ch02.sec02;

public class ArrayLengthExample {
    public static void main(String[] args) {
        // 배열의 길이
        int[] scores = {83, 90, 87};

        // length 를 사용하면 배열의 길이를 구할 수 있다.
        int length = scores.length;
        System.out.println("length = " + length);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(scores[i]);
        }

        // 배열의 요소를 순회할 때 length 연산자를 사용하는 이유
        //  - ArrayIndexOutOfBoundException 방지를 위해서
        for (int i = 0; i < 4; i++) {
            System.out.println(scores[i]);
        }

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
    }
}
