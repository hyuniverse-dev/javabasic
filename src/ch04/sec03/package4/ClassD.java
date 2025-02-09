package ch04.sec03.package4;

public class ClassD {
    public void start(Person person) {
        // person이 student인 경우는 study() 메소드
        if (person instanceof Student student) {
//            Student student = (Student) person;
            System.out.println("studentNo = " + student.studentNo);
            student.study();
        }

        // person이 teacher인 경우는 teach() 메소드
        if (person instanceof Teacher teacher) {
//            Teacher teacher = (Teacher) person;
            System.out.println("subject = " + teacher.subject);
            teacher.teach();
        }
    }
}
