import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decision {
    public static void main(String[] args) throws IOException {
        int n1, n2, n3, n4, n5;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first subject marks out of 100");
        n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the second subject marks out of 100");
        n2 = Integer.parseInt(br.readLine());
        System.out.println("Enter the third subject marks out of 100");
        n3 = Integer.parseInt(br.readLine());
        System.out.println("Enter the fourth subject marks out of 100");
        n4 = Integer.parseInt(br.readLine());
        System.out.println("Enter the fifth subject marks out of 100");
        n5 = Integer.parseInt(br.readLine());
        double avg = (n1 + n2 + n3 + n4 + n5) / 5;
        System.out.println("Average marks is");
        System.out.println(avg);
        if (avg >= 90) {
            System.out.println("you will get bicycle");
        } else if (avg >= 70 && avg < 90) {
            System.out.println("you will get chocolate");
        } else {
            System.out.println("study hard");


        }
    }
}
