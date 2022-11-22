import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methodinvocation {

        public static void add(int x,int y){
            System.out.println(x+y);
        }
        public static void sub(int x, int y) {

            if (x > y) {
                System.out.println(x - y);
            } else {
                System.out.println(y - x);
            }
        }

    public static void mul(int x,int y){
        System.out.println(x*y);
    }

    public static void div(int x,int y){
        System.out.println(x/y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for Add, 2 for Sub, 3 for Mul, 4 for Div");
        int a = 0;
        a=Integer.parseInt(br.readLine());
        switch (a){
            case 1 -> add(3,5);
            case 2 -> sub(6,7);
            case 3 -> mul(5,8);
            case 4 -> div(5,7);

        }



    }
}
