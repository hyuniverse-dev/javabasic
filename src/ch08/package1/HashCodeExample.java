package ch08.package1;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");
        Student s3 = new Student(1, "김길동");

        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("s3.hashCode() = " + s3.hashCode());

        if (s1.hashCode() == s2.hashCode()) {
            System.out.println("같은 학생입니다.");
        } else {
            System.out.println("다른 학생입니다.");
        }

        if (s1.hashCode() == s3.hashCode()) {
            System.out.println("같은 학생입니다.");
        } else {
            System.out.println("다른 학생입니다.");
        }

        System.out.println();

        // equals() 사용해서 객체 동등 비교 실행
        if (s1.equals(s2)) {
            System.out.println("같은 학생입니다.");
        } else {
            System.out.println("다른 학생입니다.");
        }

        if (s1.equals(s3)) {
            System.out.println("같은 학생입니다.");
        } else {
            System.out.println("다른 학생입니다.");
        }

    }
}
