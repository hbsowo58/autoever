public class P063_QualityControl {
    public static void main(String[] args) {
        int[] weights = {100, 102, 95, 110, 88, 105, 101, 99, 103, 100};

        int defectCount = 0; // 불량품
        final int LIMIT_WEIGHT_MIN = 90; // 최소 허용 무게
        final int LIMIT_WEIGHT_MAX = 110; // 최대 허용 무게
        final int MAX_DEFECTS = 3;       // 최대 불량수

        for (int i = 0; i < weights.length; i++) {
            int currentWeight = weights[i];

            if (currentWeight < LIMIT_WEIGHT_MIN || currentWeight > LIMIT_WEIGHT_MAX) {
                defectCount++;
            }

            if (defectCount >= MAX_DEFECTS) {
                break;
            }
        }
    }
}
