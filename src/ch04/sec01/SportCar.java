package ch04.sec01;

public class SportCar extends Car {

    @Override // 메소드 재정의
    public void driveMode() {
        System.out.println("스포츠 주행 모드");
    }
    
    public void driveSportMode(){
        System.out.println("스포츠 주행 모드");
    }

    @Override
    public void stop() {
        System.out.println("급정차");
    }
}
