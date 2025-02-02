package ch03.sec02;

public class Television {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    final String callCenter = "02-123-1234";

    int price;
    String color;

    // 복잡한 표현식을 사용할 때에는
    // static 블록을 사용한다.
    static {
        // static 블록 내에서는 인스턴스 멤버(필드/메소드)를 사용할 수 없다.
        info = company + "-" + model; // + "-" + this.price;
    }

    static void method1() {
        // 정적 메소드 내에서는 인스턴스 멤버를 사용할 수 없다.
        System.out.println(/*this.price*/);

        // 만약 정적 메소드 내에서 인스턴스 멤버를 사용하려면 인스턴스를 생성해서 사용한다.
        Television tv = new Television();
        int price = tv.price;
    }
}
