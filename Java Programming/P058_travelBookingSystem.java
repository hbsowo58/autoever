public class P058_travelBookingSystem {
    public static void main(String[] args){
       final int PRICE = 100000;

       String[] destinations = {"제주도", "강릉", "부산"};
       String[] bookingCounts = {"2", "0", "1"};
       boolean isMember = true;
       int age = 25;

       int count0 = Integer.parseInt(bookingCounts[0]);
       int count1 = Integer.parseInt(bookingCounts[1]);
       int count2 = Integer.parseInt(bookingCounts[2]);

       int totalBooking = count0 + count1 + count2;
       int totalPrice = totalBooking * PRICE;

        System.out.println("[예약 현황]");
        System.out.println(destinations[0] + ": " + count0 + "건");
        System.out.println(destinations[1] + ": " + count1 + "건");
        System.out.println(destinations[2] + ": " + count2 + "건");
        System.out.println();
        System.out.println("총 금액: " + totalPrice + "원");
        
        if (totalBooking >= 3 && isMember && age >=20){
            System.out.println("여행 추천 혜택 대상");
        } else {
            System.out.println("일반 고객");
        }
    }
}
