import java.sql.SQLOutput;

public class Main {
    public static int addNumber (int a, int b) {
        int result = a + b;

        return result;
    }
    public static void main(String[] args) {
        int number = addNumber(10, 7);
        int number2 = addNumber(14, 1);
        int number3 = addNumber(152, 3241);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
    }
}