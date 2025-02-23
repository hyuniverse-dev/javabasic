package ch09.sec01;

public class GenericExample1 {
    public static void main(String[] args) {
        /*
        제네릭(Generic)

        제네릭은 결정되지 않은 타입을 파라미터로 처리하고, 실제 사용할 때(시점)에 구체적인 파라미터의 타입을
        대체 시킨다.
         */

        /*
        content 필드를 Object 타입으로 사용하면 모든 객체를 대입할 수는 있다.
        하지만 content 필드를 사용할 때 강제 타입 변환을 해야되고, 혹은 instanceOf 연산자로 타입을 매번 체크해야 된다.

        box.content = "문자열";
        String content1 = (String) box.content;
         */
        Box<String> box1 = new Box<>(); // content 필드는 String 타입
        box1.content = "apple";
        String content1 = box1.content;
        System.out.println("content1 = " + content1);


        Box<Integer> box2 = new Box<>(); // content 필드 Integer 타입
        box2.content = 100;
        Integer content2 = box2.content;
        System.out.println("content2 = " + content2);


    }
}
