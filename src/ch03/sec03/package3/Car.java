package ch03.sec03.package3;

public class Car {
    private double speed;

    // Setter
    public void setSpeed(double speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    // Getter
    public double getSpeed() {
        return this.speed;
    }
}
