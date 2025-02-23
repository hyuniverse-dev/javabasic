package ch08.package1;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public int hashCode() {
        /*
        Object 의 hasCode() 메소드는 문자열의 해시코드를 정수형으로 반환한다.
        hasCode()를 재정의해서 no와 name의 해시코드가 동일하면 같은 객체로 판단한다.
         */
        System.out.println("해시 코드 = " + name.hashCode());
        return no + name.hashCode();
    }

    // equals 를 재정의해서 no와 name의 값이 동일하면 true를 반환 / 동일하지 않으면 false를 반환


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
            if (no == student.no && name.equals(student.name)) {
                return true;
            }
        }
        return false;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
