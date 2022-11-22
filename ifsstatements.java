import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifsstatements {
    public static void main(String[] args) throws IOException {
        float time;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the time in military format:");
        time = Float.parseFloat(br.readLine() );
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 17) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }// Outputs "Good evening."
    }
}