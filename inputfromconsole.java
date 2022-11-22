import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputfromconsole {
    public static void main(String[] args) throws IOException {
        int i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of i:");
        i = Integer.parseInt(br.readLine());
        System.out.println(i);
        System.out.println("Enter the value of j:");
        j = Integer.parseInt(br.readLine());
        System.out.println(j);
        System.out.println("Performing arithmetic operations on i & j");
        System.out.println(i+j); //Adding 2 integers
        System.out.println(i-j); //Subtract 2 integers
        System.out.println(i*j); //Multiply 2 integers
        System.out.println(i/j); //Divide 2 integers

    }
}
