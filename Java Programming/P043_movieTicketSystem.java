public class P043_movieTicketSystem {
        public static void main(String[] args) {
        final int PRICE_PER_TICKET = 12000;

        String[] movieTitles = {"어벤져스", "인사이드 아웃", "라라랜드"};

        String[] ticketCounts = {"1","2","3"};

        int count0 = Integer.parseInt(ticketCounts[0]);
        int count1 = Integer.parseInt(ticketCounts[1]);
        int count2 = Integer.parseInt(ticketCounts[2]);

        int total0 = count0 * PRICE_PER_TICKET;
        int total1 = count1 * PRICE_PER_TICKET;
        int total2 = count2 * PRICE_PER_TICKET;
        int grandTotal = total0 + total1 + total2;

        System.out.println("영화: " + movieTitles[0] + " 예매 수:" + count0 + " 금액 :" + total0 + "원");
        System.out.println("영화: " + movieTitles[1] + " 예매 수:" + count1 + " 금액 :" + total1 + "원");
        System.out.println("영화: " + movieTitles[2] + " 예매 수:" + count2 + " 금액 :" + total2 + "원");
        System.out.println();
        System.out.println("총 결제 금액: " + grandTotal + "원");
        }
}
