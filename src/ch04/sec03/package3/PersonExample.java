package ch04.sec03.package3;

public class PersonExample {
    public static void main(String[] args) {
        // 레스토랑 객체 생성
        Restaurant restaurant = new Restaurant();

        // restRoom() 호출할 때 각각 Man / Woman 객체를 파라미터 전달 결과 확인
        restaurant.restRoom(new Man());
        restaurant.restRoom(new Woman());
    }
}
