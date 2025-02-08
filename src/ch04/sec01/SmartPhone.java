package ch04.sec01;

public class SmartPhone extends Phone {
    private boolean isWifiOn;

    public SmartPhone(String color, String model, boolean isWifiOn) {
        super(color, model);
        this.isWifiOn = isWifiOn;
    }

    public boolean isWifiOn() {
        return this.isWifiOn;
    }

    public String getColor() {
        return super.getColor();
    }

    public String getModel() {
        return super.getModel();
    }

    public void setWifiOn(boolean isWifiOn) {
        this.isWifiOn = isWifiOn;
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
