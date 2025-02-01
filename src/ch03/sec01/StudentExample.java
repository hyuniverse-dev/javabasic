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

        Student student3 = new Student("영식", 20, "남자");
        System.out.println(student3);
        student3.introduce();

        Student student4 = new Student("옥순", 21, "여자");
        System.out.println(student4);
        student4.introduce();

        // 영식, 옥순이의 출생연도를 출력하세요.
        int student3Age = student3.calculateYear();
        System.out.println("student3Age = " + student3Age);

        int student4Age = student4.calculateYear();
        System.out.println("student4Age = " + student4Age);
    }
}
