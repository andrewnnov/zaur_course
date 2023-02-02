package lesson3;

public class HMLesson3 {

    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1= 5.5;
        double d2= 1.3;
        long l = 20l;
        double result = 0;

        System.out.println(((Object) (i1/d2)).getClass().getSimpleName());

        //System.out.println(i2 / d1 + d2 % i1 - l);

        int a = 5;
        int c = a-- - --a + ++a + a++ +a;
        System.out.println(c);

        int b = 8;
        int e = ++b - b++ + ++b - --b;
        System.out.println(e);


    }
}
