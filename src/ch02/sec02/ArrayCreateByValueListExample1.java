package ch02.sec02;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        // 배열을 생서하고 요소를 초기화하는 방법(1)
        String[] season = {"Spring", "Summer", "Fall", "Winter"};
        
        // 배열의 요소(데이터) 값을 읽기
        System.out.println(season[0]);
        System.out.println(season[1]);
        System.out.println(season[2]);
        System.out.println(season[3]);
        
        // 배열의 요소 값을 변경하기
        season[1] = "여름";

        //  Winter를 "겨울"로 변경
        season[3] = "겨울";

        for (int i = 0; i < season.length; i++) {
            System.out.println(season[i]);
        }

        // 연습문제
        //  A반에는 옥순, 정숙, 영철이 있습니다.
        //  각각의 국어점수는 83, 90, 87 입니다.
        //  A반 학생들의 국어점수를 배열로 생성 --- 1
        //  A반 학생들의 국어점수 총합과 평균을 구해서 결과를 출력하세요 --- 2
        int[] scores = {83, 90, 87};

        //  반복문을 사용해서 누적합 구하기
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println("sum = " + sum);

        // 평균 구하기
        double avg = (double) sum / scores.length;

        System.out.println("avg = " + avg);








        
    }
}
