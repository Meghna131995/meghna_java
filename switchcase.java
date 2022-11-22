import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcase {
    public static void main(String[] args) throws IOException {
        int day;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the day number 1-7");
        day = Integer.parseInt(br.readLine() );
        System.out.println("Day number entered is "+day);
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }
    }
}
