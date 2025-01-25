package ch02.sec01;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // null 과 NullPointerException
        String str1 = null; // null 은 참조할 주소가 없는 상태를 얘기합니다.
        System.out.println("str1 = " + str1);

//        str1.equals("Java"); // NullPointerException 발생
//        int str1Length = str1.length();
        
        // NullPointerException 방지하는 방법
        boolean isEquals = "Java".equals(str1);

        System.out.println("isEquals = " + isEquals);
        System.out.println("프로그램이 종료되었습니다.");
        
        // (1) 타의적으로 null 사용이 되는 경우
        //  - 데이터베이스에 저장되어 있는 값이 null인 경우
        //  - 서드파티(API)를 사용하는 경우 응답이 값이 null인 경우

        // (2) 자의적으로 null 사용이 되는 경우
        //  - 가비지 컬렉터를 활용하기 위해서(리소스 관리를 위해)
        String str2 = "Hello";
        System.out.println(str2);
        str2 = null;

        //  - hobby1의 참조주소를 hobby2에 복사했기 때문에
        //    GC의 대상이 되지 않는다.
        String hobby1 = "여행";
        String hobby2 = hobby1;
        hobby1 = null;

        System.out.println("hobby2 = " + hobby2);


        
        
        
        
        
        
        
        
        
    }
}
