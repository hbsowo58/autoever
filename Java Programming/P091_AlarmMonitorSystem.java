class AlarmRequest {
    String machineName;
    int errorCode;
    double currentTemp;

    AlarmRequest(String name, int code, double temp) {
        this.machineName = name;
        this.errorCode = code;
        this.currentTemp = temp;
    }
}

public class P091_AlarmMonitorSystem {
    public static void main(String[] args) {
        AlarmRequest request = new AlarmRequest("Press-01", 100, 120.5);
        String finalMessage = generateMessage(request);
        System.out.println("관리자 전송 문자: " + finalMessage);
    }

    public static String generateMessage(AlarmRequest req) {
        String errorDetail;
        errorDetail = switch (req.errorCode) {
            case 100 -> "과열 위험";
            case 200 -> "전원 불안정";
            default -> "기타 시스템 오류";
        };

        return "[" + req.machineName + "] " + errorDetail + " 감지됨 (현재온도: " + req.currentTemp + "도)";
    }
}