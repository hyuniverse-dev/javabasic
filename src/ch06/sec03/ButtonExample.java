package ch06.sec03;

public class ButtonExample {
    public static void main(String[] args) {

        // 버튼 객체 생성
        Button okBtn = new Button();

        // Ok 버튼 객체에 ClickListener 구현체 주입
        okBtn.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        });

        // Ok 버튼 클릭
        okBtn.click();

        // -------------------------------------

        // Cancel 버튼 객체 생성
        Button cancelBtn = new Button();

        // Cancel ClickListener 구현체 주입
        cancelBtn.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        // Cancel 버튼을 클릭
        cancelBtn.click();
    }
}
