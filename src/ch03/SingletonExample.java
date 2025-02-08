package ch03;

import ch03.sec03.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        // 싱글톤 객체를 Getter로 호출
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // 동일한 객체인지 참조 여부 확인
        if (instance1 == instance2) {
            System.out.println("instance1 == " + instance1);
            System.out.println("instance2 = " + instance2);
        } else {
            System.out.println("다른 객체입니다.");
        }

        String data = Singleton.getData();
        System.out.println("data = " + data);

    }
}
