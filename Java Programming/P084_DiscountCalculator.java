public class P084_DiscountCalculator {
    public static int getDiscountedPrice(int basePrice, int discountAmount, double discountRate) {
        return (int)(basePrice - discountAmount * discountRate);
    }

    public static void main(String[] args) {
        int discountAmount = 20000;
        double discountRate = 1.1;

        int jejuPrice = getDiscountedPrice(200000, discountAmount, discountRate);
        int gangneungPrice = getDiscountedPrice(150000, discountAmount, discountRate);
        int busanPrcie = getDiscountedPrice(180000, discountAmount, discountRate);

        System.out.println("제주도 가격: " + jejuPrice + "원");
        System.out.println("강릉 가격: " + gangneungPrice + "원");
        System.out.println("부산 가격: " + busanPrcie + "원");
    }
} 