public class Main {
    public static void main(String[] args) {

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        boolean a = false;
//        while (a) {
//            System.out.println("무한루프 1");
//        }
//
//        do {
//            System.out.println("무한 루프 2");
//        } while (a);

//        boolean a = true;
//        int b = 1;
//
//        while (a) {
//            System.out.println(b);
//            b++;
//
//            if (b > 10000) {
//                a = false;
//            }
//        }

        int input = 1;

        do {
            System.out.println("안녕하세요 자판기 입니다.");

            // input = 0;
            switch (input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못 고름 ㅋ");
            }
            input = 0;
        } while (input != 0);
    }
}