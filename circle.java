import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class circle {

    public static void area(int r) {
        double a=3.142*r*r;
        System.out.println("Area of the circle is "+a);

    }
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the value of r");
    int rad=Integer.parseInt(br.readLine());
        area(rad);
}
}

