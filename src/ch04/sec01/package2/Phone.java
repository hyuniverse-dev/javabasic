package ch04.sec01.package2;

// 모든 핸드폰의 종류가 가지고 있어야할 속성과 동작을 정의한 부모클래스 (Super class)
public class Phone {
    // 공통의 필드 선언
    private String model;
    private String color;
    private String data;

    public Phone(String color, String model) {
        checkModel(model);
        checkColor(color);
    }

    private void checkColor(String color) {
        String[] colors = {"화이트", "블랙", "레드", "블루"};
        this.color = "알 수 없는 색상입니다.";
        for (String item : colors) {
            if (item.equals(color)) {
                this.color = color;
            }
        }
    }

    private void checkModel(String model) {
        String[] models = {"아이폰", "안드로이드", "블랙베리"};
        this.model = "알 수 없는 모델입니다.";
        for (String item : models) {
            if (item.equals(model)) {
                this.model = model;
            }
        }
    }

    /// //// public Getter ///////
    public String getData() {
        return this.data;
    }

    /// //// protected Getter ///////
    protected String getModel() {
        return this.model;
    }

    protected String getColor() {
        return this.color;
    }

    /// //// 공통의 메소드 선언 ///////

    // 벨 울림 메소드
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    // 통화 내용 전송하는 메소드
    public void sendVoice(String message) {
        System.out.println("나: " + message);
    }

    // 통화 내용 수신받는 메소드
    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    // 전화 끊는 메소드
    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
