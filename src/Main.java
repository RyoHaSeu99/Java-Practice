public class Main {
    public static void main(String[] args) {

        int number = 991025;

        String binaryString = Integer.toBinaryString(number);
        String hexString = Integer.toHexString(number);
        ;
        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + binaryString);
        System.out.println("Hex: " + hexString);
    }
}