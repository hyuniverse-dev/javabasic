package ch01.sec03;

public class CastingExample {
    public static void main(String[] args) {
        int iValue = 10;
        byte bValue = (byte) iValue;
        System.out.println("bValue = " + bValue);

        long lValue = 1000L;
        iValue = (int) lValue;
        System.out.println("iValue = " + iValue);

        bValue = (byte) lValue;
        System.out.println("bValue = " + bValue);

        float fValue = 23.14567458F;
        short sValue = (short) fValue;
        System.out.println("sValue = " + sValue);
    }
}
