package ch03.sec01;

public class Student {
    // 필드 (1)String 타입 name (2)int 타입 age (3)String 타입 gender 를 정의
    String name;
    int age;
    String gender;

    // 기본 생성자 선언
    public Student() {

    }

    // 생성자 선언 (생성자 오버로딩) - 필드를 다양한 형식으로 초기화 할 수 있도록 생성자의 매개변수를 여러가지로 선언하는 방법
    public Student(String name) {
        this.name = name; // 매개변수명 수정
    }
    
    // 생성자 선언 (생성자 오버로딩)
    public Student(String name, int age, String gender) {
        this.name = name; // 매개변수명 수정
        this.age = age; // 매개변수명 수정
        this.gender = gender; // 매개변수명 수정
    }
}
