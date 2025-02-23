package ch10.sec01;

public class JoinExample {
    public static void main(String[] args) {
        // 멀티 스레드 주의할 점 (join 처리)
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("합 : " + sumThread.getSum());
    }
}
