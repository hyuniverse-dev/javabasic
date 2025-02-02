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

    // introduce 메소드 정의
    void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + this.name + "입니다. 나이는 " + this.age + "살이고 " + this.gender + " 학생입니다.");
    }

    // calculateYear 메소드를 정의하고, 출생연도를 반환하도록 완성하세요.
    int calculateYear() {
        if (this.age < 2025) {
            return 2025 - this.age;
        }
        return 0;

//        System.out.println("마지막 줄 입니다."); -> 컴파일 에러 발생(Unreachable code)
    }
}
