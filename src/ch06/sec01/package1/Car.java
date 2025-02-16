package ch06.sec01.package1;

public class Car {
    /*
    인스턴스 필드
    1. Tire 타입의 tire1, tire2 선언 -> 중첩된 클래스 통해서 초기화
    2. Engine 타입의 engine 선언 -> 중첩된 클래스 통해서 초기화
    3. Window 타입의 window 선언 -> 중첩된 클래스 통해서 초기화
     */

    Tire tire1 = new Tire();
    Tire tire2 = new Tire();
    Engine engine = new Engine();
    Window window = new Window();

    /*
    중첩 인스턴스 클래스
    1. Tire
    2. Engine
    3. Window
     */
    class Tire {

    }

    class Engine {

    }

    class Window {

    }

}
