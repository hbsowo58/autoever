import java.util.HashMap;

public class P107_MachineStatusChecker {
    public static void main(String[] args) {
        HashMap<String, String> machineMap = new HashMap<>();

        machineMap.put("PRESS-01", "RUNNING");
        machineMap.put("ROBOT-02", "STOPPED");
        machineMap.put("CUTTER-03", "ERROR");

        String searchId = "PRESS-01";

        System.out.println("조회 시스템 가동...");

        if (machineMap.containsKey(searchId)) {
            String status = machineMap.get(searchId);
            System.out.println("장비 ID: " + searchId + "의 현재 상태는 [" + status + "] 입니다.");
        } else {
            System.out.println("에러: " + searchId + "는 등록되지 않은 장비입니다.");
        }
    }
}