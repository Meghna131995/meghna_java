class employee extends employee_bonus{
    public int salary(int x) {
        System.out.println("Monthly salary "+x);
        return x;
    }
}
class employee_bonus extends employee_extra{
    public int monthly_bonus(int y) {
        System.out.println("Monthly bonus "+y);
        return y;
    }
}

class employee_extra{
    public int yearly_bonus(int z) {
        System.out.println("Yearly bonus "+z);
        return z;
    }
}

public class salary_inheritance {
    public static void main(String[] args){
        employee s = new employee();
        int sal=s.yearly_bonus(1000)+s.monthly_bonus(500)+s.salary(30000);
        System.out.println("Total salary " +sal);

    }
}
