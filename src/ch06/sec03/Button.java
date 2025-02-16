package ch06.sec03;

public class Button {
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // Setter
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // click 메소드
    public void click() {
        clickListener.onClick();
    }
}
