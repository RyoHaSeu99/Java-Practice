import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        char asciChar = 'A';
        System.out.println("Character: " + asciChar);

        int asciCode = (int) asciChar;
        System.out.println("ASCII Code: " + asciCode);

        char koreanChar = '가';
        System.out.println("Character: " + koreanChar);

        int unicodeCode = (int) koreanChar;
        System.out.println("Unicode: U+" + Integer.toHexString(unicodeCode).toUpperCase());
    }
}
// 48 50 49 49 50 50