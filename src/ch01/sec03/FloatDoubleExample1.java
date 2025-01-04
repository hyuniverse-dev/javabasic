package ch01.sec03;

public class FloatDoubleExample1 {
    public static void main(String[] args) {
        // (1) float, (2) double
        double value1 = 3.14;
        System.out.println("value1 == " + value1);

        double value2 = -3.14;
        System.out.println("value2 == " + value2);

        float value3 = 3.14F;
        System.out.println("value3 == " + value3);

        double value4 = 5e2;
        System.out.println("value4 == " + value4);

        ////////////////// 연습 //////////////////

        // double 타입의 value5 변수에 2.78 리터럴을 대입하세요.
        double value5 = 2.78;
        System.out.println("value5 == " + value5);

        // float 타입의 value6 변수에 1.34 리터럴을 대입하세요.
        float value6 = 1.34F;
        System.out.println("value6 == " + value6);

        ///////////////////////////////////////////


        // (2)float과 double의 정밀도 차이 확인하기
        float value7 = 0.1234567890123456789F;
        double value8 = 0.1234567890123456789;
        System.out.println("value7 == " + value7);
        System.out.println("value8 == " + value8);


    }
}
