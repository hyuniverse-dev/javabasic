package ch04.sec03.package4;

public class Teacher extends Person {
    public String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("강의를 합니다.");
    }
}
