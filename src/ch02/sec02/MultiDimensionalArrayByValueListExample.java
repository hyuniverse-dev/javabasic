package ch02.sec02;

public class MultiDimensionalArrayByValueListExample {
    public static void main(String[] args) {
        // 2차원 밸열 생성
        int[][] scores = {
                {83, 90, 87},
                {88, 95}
        };

        // 배열의 길이
        System.out.println("1차원 배열 길이(반의 개수) = " + scores.length);
        System.out.println("2차원 배열 길이(A반의 학생 수) = " + scores[0].length);
        System.out.println("2차원 배열 길이(B반의 학생 수) = " + scores[1].length);

        // A반 학생 중 세번째 학생의 점수 출력하기
        System.out.println("A반 3번 학생의 점수 = " + scores[0][2]);

        // B반 학생 중 두번째 학생의 점수 출력하기
        System.out.println("B반 2번 학생의 점수 = " + scores[1][1]);

        // A반 학생들의 평균 점수 구하기
        int sum1 = 0;
        for (int i = 0; i < scores[0].length; i++) {
            sum1 += scores[0][i];
        }
        System.out.println("A반 학생들의 평균 점수 = " + ((double) sum1 / scores[0].length));


        // B반 학생들의 평균 점수 구하기
        int sum2 = 0;
        for (int i = 0; i < scores[1].length; i++) {
            sum2 += scores[1][i];
        }
        System.out.println("B반 학생들의 평균 점수 = " + ((double) sum2 / scores[1].length));

        // A학교 전체 학생의 평균 점수 구하기
        int totalSum = 0;
        int totalLength = scores[0].length + scores[1].length;

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                totalSum += scores[i][j];
            }
        }
        System.out.println("A학교의 전체 학생의 평균 점수 = " + ((double) totalSum / totalLength));
    }
}
