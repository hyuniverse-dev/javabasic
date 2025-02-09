package ch04.sec03.package4;

public class PersonExample {
    public static void main(String[] args) {
        ClassD classD = new ClassD();
        Student student = new Student("학생1", 1);
        Teacher teacher = new Teacher("강사1", "자바");

        classD.start(student);
        classD.start(teacher);

    }
}
