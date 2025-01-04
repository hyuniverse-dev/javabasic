package ch01.sec02;

public class VariableDeclaration {
    public static void main(String[] args) {
        // 1. 변수
        //  - 프로그램이 실행되는 중 데이터를 저장하는 공간
        //  - 메모리 주소를 직접 사용불가하기 때문에 인간의 언어로 사용(저장) 할 수 있는 방법
        //  - 하나의 변수에는 하나의 값만 저장이 가능
        //  - 변수의 타입(종류)에 맞는 데이터만 저장이 가능 (택배상자 <-> 상품)

        // 2. 변수 선언(생성)
        int age; // 정수 데이터를 저장하는 변수이면서 나이를 저장하는 변수
        double height; // 실수 데이터를 저장하는 변수이면서 키를 저장하는 변수

        // 3. 변수명 규칙
        //  - 숫자로 시작할 수 없다.
        //  - 특수문자는 $, _ 만 가능
        //  - 데이터를 잘 표현하는 이름으로 작성
        //  - 카멜케이스 표기법 작성: 소문자로 작성, 두 단어 이상 사용되면 두 번째 단어의 첫 글자는 대문자로 작성
        int studentNumber;
        //  - 축약어보다는 데이터를 정확히 표현하는 단어로 작성
        int stdNum;

        // 4. 변수에 값(데이터) 대입
        age = 20;
        System.out.println(age);

        age = 30;
        System.out.println(age);

        // 5. 변수 선언과 동시에 초기화
        int score = 90;

        // 6. 변수 선언의 잘못된 예
        int number = 0;
        int result = number + 10;

        // 7. 다른 변수의 값을 복사하기
        int number2 = 10;
        int number3;
        number3 = number2;
        int number4 = number2;

        // 8. 왜 변수를 사용하는가?
        //  - 기획자 왈: "똑똑~ 개발자님~ 죄송한데 숫자를 50, 60으로 수정해주세요"
        int number5 = 100;
        int number6 = 20;
        System.out.println(number5 + number6);
        System.out.println(number5 - number6);
        System.out.println(number5 * number6);
        System.out.println(number / number6);
        
        // 9. 변수 선언의 새로운 방법(Java10+)
        //  - 타입추론형 사용 가능
        //  - 지역 변수에서만 사용 가능(제한적)
        var value1 = 10;
        var value2 = 3.14;

    }
}


















