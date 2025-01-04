package ch01.sec03;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 형변환(Promotion)

        byte bValue = 10;
        int iValue = bValue;
        System.out.println("iValue = " + iValue);

        char cValue = '가';
        iValue = cValue;
        System.out.println("iValue = " + iValue);

        iValue = 100;
        long lValue = iValue;
        System.out.println("lValue = " + lValue);

        lValue = 5000L;
        float fValue = lValue;
        System.out.println("fValue = " + fValue);

        double dValue = lValue;
        System.out.println("dValue = " + dValue);
    }
}
