class cal {     // child
    public int cal_add(int x, int y) {
        return x + y;
    }

    public int cal_sub(int x, int y) {
        return x - y;
    }

    public int cal_mul(int x, int y) {
        return x * y;
    }

    public float cal_div(float x, float y) {
        return x/y;
    }
}
class main_cal extends cal{     // parent class
    void arithmetic(){
        System.out.println("Performing arithmetic operations ");

    }
}


public class inheritance {
    public static void main(String[] args) {
        main_cal c=new main_cal();
        c.arithmetic();
        System.out.println("add " +c.cal_add(2,5));
        System.out.println("Sub " +c.cal_sub(7,5));
        System.out.println("Sub " +c.cal_mul(7,9));
        System.out.println("Div " +c.cal_div(6,8));

    }
}