public class Main {
    public static void main(String[] args) {

        int a = 10, b = 3;

        a += 5; // a = a + 5(계산기 등에 이용 가능할듯
        System.out.println(a);
        // a = 15, b = 3
        b -= 2;
        System.out.println(b);
        // a = 15, b = 1
        a *= b;
        System.out.println(a);
        // a = 15, b = 1
        a /= 7;
        System.out.println(a);
        // a = 2, b = 1
        a %= 8;
        System.out.println(a);
        // a = 2, b = 1
    }
}