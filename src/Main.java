public class Main {
    public static void main(String[] args) {

       int a = 10, b = 3;

       ++a;     // 전위형
        System.out.println(a);

        --b;
        System.out.println(b);

        a++;    // 후위형
        System.out.println(a);

        b--;
        System.out.println(b);

        System.out.println(++a);
        System.out.println(a++);    // 사용하고있지 않은 변수는 회색으로 표시됨
        // 후위형은 로직이 처리된 후 값이 증가하기 때문에
        // 증감연산자가 적용되지 않음
        // System.out.println(a);
    }
}