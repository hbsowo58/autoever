public class P037_variablesDefinition {
    public static void main(String[] args) {
        String name = "김자바";
        System.out.println(name);
        int age = 29;
        System.out.println(age);
        boolean isLoggedIn = true;
        System.out.println(isLoggedIn);
        long memberId = 202406131234L;
        System.out.println(memberId);
        double rating = 4.8;
        System.out.println(rating);
        String PhoneNumber = null;
        System.out.println(PhoneNumber);

        //방법 1: 크기 먼저 지정 후 값 대입
        //String[] tags = new String[3];
        //tags[0] = "코딩";
        //tags[1] = "자바";
        //tags[2] = "웹개발";

        String[] tags = {"코딩","자바","웹개발"};

        for(int i = 0; i < tags.length; i++){
            System.out.println(tags[i]);
        }

    }
}
