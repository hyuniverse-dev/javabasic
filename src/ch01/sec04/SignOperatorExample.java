package ch01.sec04;

public class SignOperatorExample {
    public static void main(String[] args) {
        // 부호 & 증감 연산자
        int iValue1 = 100;
        int iValue2 = -iValue1;
        System.out.println("iValue2 = " + iValue2);

        int x = 1;
        int y = 1;
        int z;
        int i;

        // ++ 또는 -- 가 변수 뒤: 후위 연산
        // ++ 또는 -- 가 변수 앞: 전위 연산
        x++; // x = x + 1;
        System.out.println("x = " + x);

        ++x;
        System.out.println("x = " + x);

        y--; // y = y - 1;
        System.out.println("y = " + y);

        --y;
        System.out.println("y = " + y);
        
        // 후위연산: 다른 연산(대입연산 포함)이 다 수행된 이후에 1 증가(감소)
        z = x++;
        System.out.println("x = " + x);
        System.out.println("z = " + z);

        // 전위연산: 먼저 1 감소(증가) 후 다른 연산 수행
        i = --y;
        System.out.println("i = " + i);
    }
}
