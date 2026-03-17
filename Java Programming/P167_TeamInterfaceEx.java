// 클래스: 공통 기능 제공
class Team {
    String name;
    Team(String name) {
        this.name = name;
    }
    public void intro() {
        System.out.println(name + "팀입니다.");
    }
}

// 인터페이스: 보고, 결재 기능
interface Approvable {
    void report();
    void approve();
}

// SupportTeam 클래스: 추상 클래스 상속 + 인터페이스 구현
class SupportTeam extends Team implements Approvable {
    SupportTeam(String name) {
        super(name);
    }
    @Override
    public void report() {
        System.out.println("고객지원팀: 문의 처리 결과 보고");
    }
    @Override
    public void approve() {
        System.out.println("고객지원팀: 결재 승인 완료");
    }
}

public class P167_TeamInterfaceEx {
    public static void main(String[] args) {
        SupportTeam support = new SupportTeam("고객지원");

        support.intro();
        support.report();
        support.approve();
    }
} 