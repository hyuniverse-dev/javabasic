package ch01.sec04;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        // 논리연산자
        //  AND(논리곱), OR(논리합), 그 외 (배타적 논리합, 논리 부정)

        boolean isTrue = true;
        boolean isFalse = false;

        //  AND 연산 - &&(&)
        boolean result = isTrue && isTrue;
        System.out.println("result = " + result);

        result = isTrue && isFalse;
        System.out.println("result = " + result);

        result = isFalse && isFalse;
        System.out.println("result = " + result);

        // OR 연산 - ||(|)
        result = isTrue || isTrue;
        System.out.println("result = " + result);

        result = isTrue || isFalse;
        System.out.println("result = " + result);

        result = isFalse || isFalse;
        System.out.println("result = " + result);

        result = isFalse || isFalse || isTrue;
        System.out.println("result = " + result);

        // &&, ||와 &, |의 차이점
        //  &&, || : 단축평가 적용
        result = isFalse || isTrue || isFalse;
        System.out.println("result = " + result);

        result = isTrue && isFalse && isTrue;
        System.out.println("result = " + result);

        // &, | : 단축평가 미적용
        result = isFalse | isTrue | isFalse;
        System.out.println("result = " + result);

        result = isTrue & isFalse & isFalse;
        System.out.println("result = " + result);

        // 단축평가 결과 예시
        //  number 변수의 값이 증가하지 않는다.
        int number = 0;
        boolean b = (10 > 2) && false && (number++ > 0);
        System.out.println("number = " + number);
    }
}
