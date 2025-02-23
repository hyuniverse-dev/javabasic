package ch08.package1;

public class Member {
    public String id;
    public String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            if (id.equals(member.id) && name.equals(member.name)) {
                return true;
            }
        }
        return false;
    }
}
