package ch05.sec04;

public class DriverExample {
    public static void main(String[] args) {
        Drive driver = new Drive();

        driver.drive(new Bus());
        driver.drive(new Taxi());
    }
}
