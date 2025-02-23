package ch10.sec01;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mThread = Thread.currentThread();
        System.out.println("thread = " + mThread);

        // 작업 스레드의 기본 이름 출력
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + " 작업 실행 ");
                }
            };
            thread.start();
        }

        // 작업 스레드의 이름 수정
        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "작업 실행");
            }
        };

        chatThread.setName("채팅 작업 스레드");
        chatThread.start();

    }
}
