import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class c1 {
    double area;

    public void setter(int r) {
        double a = 3.142 * r * r;
        this.area = a;
    }

    public double getter() {
        return area;
    }
}
public class getter_and_setter {
    public static void main(String[] args) throws IOException {
        c1 c = new c1();
        System.out.println("Enter the value of Radius");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rad = Integer.parseInt(br.readLine() );
        c.setter(rad);
        System.out.println("Area of circle " + c.getter());
    }
}