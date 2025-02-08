package ch04.sec01;

import lombok.Data;

@Data // @Setter + @Getter -> 롬복(lombok.jar) 기능을 사용해서 Getter | Setter 기능 사용
public class Car {
    private String model;
    private String color;
    private int speed;

    public void driveMode() {
        System.out.println("일반 주행 모드");
    }

    public void stop() {
        System.out.println("정차");
    }
}