import java.util.ArrayList;

public class P101_AlarmLogManager {
    public static void main(String[] args) {
        ArrayList<String> alarmLogs = new ArrayList<>();

        alarmLogs.add("[10:01] 1번 라인 전원 가동");
        alarmLogs.add("[10:15] 컨베이어 벨트 속도 저하 발생");
        alarmLogs.add("[10:30] 제품 수량 목표치 달성");

        int totalLogs = alarmLogs.size();
        System.out.println("현재 누적된 로그 수 : " + totalLogs + "건");

        System.out.println("--- 전체 로그 목록 ---");
        for (String log : alarmLogs) {
            System.out.println("로그 내용: " + log);
        }
    }
}
