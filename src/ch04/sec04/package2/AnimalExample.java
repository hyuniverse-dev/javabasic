package ch04.sec04.package2;

public class AnimalExample {
    public static void main(String[] args) {
        // Cat 객체 생성 + animalSound 메소드 호출
        Cat cat = new Cat();
        animalSound(cat);
        // Dog 객체 생성 + animalSound 메소드 호출
        Dog dog = new Dog();
        animalSound(dog);
    }

    public static void animalSound(Animal animal) {
        // 실체 클래스에서 정의한 sound() 메소드 호출
        animal.sound();
    }
}
