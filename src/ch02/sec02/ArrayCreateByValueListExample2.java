package ch02.sec02;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열을 선언 후 요소를 추가하는 방법(2)
        String[] names;
        
        // (상황 가정) 데이터베이스에서 데이터를 조회
        // names = {"옥순", "영자", "영식"}; -> 컴파일 에러 발생
        names = new String[]{"옥순", "영자", "영식"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 배열을 선언 후 요소를 각각 추가하는 방법(3)
        int[] scores;
        scores = new int[3];

        //  배열의 크기만 지정하면 각 요소는 기본값(default value)을 할당
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        scores[0] = 90; // 0번 인덱스 옥순이 점수를 추가
        scores[1] = 87; // 1번 인덱스 영자 점수를 추가
        scores[2] = 86; // 2번 인덱스 영식 점수를 추가

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }



        
        
    }
}
