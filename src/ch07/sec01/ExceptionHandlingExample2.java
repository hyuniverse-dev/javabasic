package ch07.sec01;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        String[] arry = {"100", "1oo"};

        for (int i = 0; i <= arry.length; i++) {
            try {
                int value = Integer.parseInt(arry[i]);
                System.out.println("arry[" + i + "] = " + value);
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없습니다. " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                System.out.println("예외가 발생했습니다." + e.getMessage());
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
