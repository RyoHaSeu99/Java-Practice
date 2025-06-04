public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }


//        int number = 9;
//        for (int i = 1; i <= 9 ; i++) {
//            System.out.println(number + " x " + i + " = " + (number * i));
//        }


//        int number = 5;
//
//        for (int i = 1; i <= 19; i++) {
//            if (i >= 5) {
//                System.out.println(number + " x " + i + " = " + (number * i));
//            }
//        }

//        for (int i = 1; i <= 20; i++) {
//            if (i % 3 == 0) {
//                System.out.println("i 는 " + i);
//            }

        for (int i = 1; i <= 9; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println("i는 " + i + ", j는 " + j);
//            }
//
//        }
    }
}