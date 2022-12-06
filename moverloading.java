import java.io.IOException;

public class moverloading {
    public static void cal(float x, float y) {
        System.out.println(x + y);
    }

    public static void cal(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void cal(int i, int j, int k, int l) {
        System.out.println(i * j * k * l);
    }

    public static void cal(String m) {
        System.out.println(m);
    }

    public static void main(String[] args) throws IOException {

        cal(3.6f, 5.87f);
        cal(6, 7, 7);
        cal(4, 7, 6, 9);
        cal("meghna");

    }

}