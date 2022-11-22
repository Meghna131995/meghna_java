import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class initialisingoperator {
    public static void main(String[] args) throws IOException {
        int i = 8;
        int j = 9;
        int k = 4;
        System.out.println(i < j);
        System.out.println(++k);
        System.out.println(i < j && i > k);
        System.out.println(i > j || i > k);

        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a:");
        a = Integer.parseInt(br.readLine());
        System.out.println(a);
        System.out.println("Enter the value of b:");
        b = Integer.parseInt(br.readLine());
        System.out.println(b);
        if (a > b) {
            System.out.println("A is greater then B");
        } else {
            System.out.println("B is greater than A");
        }
    }
}