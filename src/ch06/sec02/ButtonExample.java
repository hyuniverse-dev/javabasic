package ch06.sec02;

public class ButtonExample {
    public static void main(String[] args) {

        // 버튼 객체 생성
        Button okBtn = new Button();

        // OK 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스) 사용
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        // Ok 버튼 객체에 ClickListener 구현체 주입
        okBtn.setClickListener(new OkListener());

        // Ok 버튼 클릭
        okBtn.click();

        // -------------------------------------

        // Cancel 버튼 객체 생성
        Button cancelBtn = new Button();

        // Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스) 선언
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        // Cancel ClickListener 구현체 주입
        cancelBtn.setClickListener(new CancelListener());

        // Cancel 버튼을 클릭
        cancelBtn.click();
    }
}
