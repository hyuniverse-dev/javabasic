package ch03.sec01;

public class StudentExample {
    public static void main(String[] args) {
        // Student 클래스(설계도)를 통해서 인스턴스 만들기(물리적인 객체)
        Student student = new Student();
        System.out.println("student1 = " + student);

        Student student2 = new Student();
        System.out.println("student2 = " + student2);

        Teacher teacher = new Teacher();
        System.out.println("teacher1 = " + teacher);

        Teacher teacher2 = new Teacher();
        System.out.println("teacher2 = " + teacher2);
    }
}
