package lesson3;

public class MainClass {

    public static void main(String[] args) {
        int a = 5;
        int b = 50;
        int c = 99;
        int d = 100;
        boolean e = a < b || ++c == d;

        System.out.println(e);
        System.out.println(c);

        boolean h = a < b | ++c == d;
        System.out.println(h);
        System.out.println(c);

        boolean a1 = false;
        boolean a2 = false;
        boolean a3 = true;

        System.out.println(a1^a2^a3); //when only one true

    }
}
