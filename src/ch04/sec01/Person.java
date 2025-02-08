package ch04.sec01;

public class Person {
    private String name;
    private String gender;
    private int age;

    // Getter | Setter 편의 기능을 사용해서 만들기
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
