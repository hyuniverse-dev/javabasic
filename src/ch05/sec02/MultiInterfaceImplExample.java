package ch05.sec02;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        /*
        구현체를 통해 인스턴스를 생성하고 대입하는 인터페이스 타입에 따라
        사용할 수 있는 기능이 달라진다.
         */

        // RemoteControl2 인터페이스에 선언된 추상 메소드만 호출 가능
        RemoteControl2 st = new SmartTelevisionImpl();
        st.turnOn();
        st.turnOff();

        // Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
        Searchable st2 = new SmartTelevisionImpl();
        st2.search("네이버");

        SmartTelevision st3 = new SmartTelevisionImpl2();
        st3.turnOn();
        st3.turnOff();
        st3.search("구글");

        RemoteControl2 rc1 = st3;
        rc1.turnOn();
        rc1.turnOff();
    }
}
