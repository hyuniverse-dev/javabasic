package ch01.sec05;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        // switch 표현식 도입(Java14+)
        String message = "welcome";
        String krMessage = "";

        switch (message) {
            case "Hello", "hello" -> {
                krMessage = "안녕하세요.";
                System.out.println("안녕하세요.");
            }
            case "Bye", "bye" -> {
                krMessage = "잘가세요.";
                System.out.println("잘가세요.");
            }
            case "Welcome", "welcome" -> {
                krMessage = "환영합니다.";
                System.out.println("환영합니다.");
            }
            default -> {
                krMessage = "번역할 수 없습니다.";
                System.out.println("번역할 수 없습니다.");
            }
        }

        System.out.println(krMessage);

        // switch 표현식으로 변수에 직접 값 대입
        String koreanName = switch (message) {
            case "Hello", "hello" -> "안녕하세요.";
            case "Bye", "bye" -> "잘가세요.";
            case "Welcome", "welcome" -> "환영합니다.";
            default -> "번역할 수 없습니다.";
        };

        System.out.println(koreanName);
    }
}
