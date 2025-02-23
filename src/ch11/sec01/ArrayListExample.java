package ch11.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /*
    ArrayList

    List 컬렉션 중 하나이다. 배열 객체를 생성한다. 일반 배열과의 차이점은 제한 없이 객체를 추가할 수 있다.
    0번부터 차례대로 객체가 저장된다. 만약 중간의 인덱스가 변경되면 해당 인덱스 기준으로 이후 인덱스의 값들이 모두 수정된다.

    [인덱스] 0   1   2   3   4   5
    [작 업]       (삭제)
    [결 과] 0   1   (3) -> 2    (4) -> 3    (5) -> 4

    따라서 ArrayList는 객체(요소)의 추가/삭제가 빈번히 일어나는 로직에는 적절하지 않다.
     */
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size = list.size();
        System.out.println("size = " + size);

        System.out.println();

        // 객체 가져오기
        Board board = list.get(2);
        System.out.println("board = " + board.getSubject());

        System.out.println();
        Board first = list.getFirst();
        System.out.println("first = " + first.getSubject());
        Board last = list.getLast();
        System.out.println("last = " + last.getSubject());

        // 객체 삭제하기
        list.remove(2);
        size = list.size();
        System.out.println("size = " + size);

        System.out.println();

        // 현재 list 출력
        for (Board item : list) {
            System.out.println(item.getSubject());
        }
    }
}
