package ch07.sec01;

public class MyResource implements AutoCloseable {

    private String name;

    public MyResource(String name) {
        this.name = name;
    }

    public String read1() {
        System.out.println("[MyResource](" + name + ")읽기");
        return "100";
    }

    public String read2() {
        System.out.println("[MyResource(" + name + ")읽기]");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResource(" + name + ")닫기");
    }
}
