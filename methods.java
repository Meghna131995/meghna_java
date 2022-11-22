public class methods {

    class abc {
        int z;
        static int Add(int a, int b) {
            int z = a + b;
            return (z);
        }

        static int Subtract(int a, int b) {
            int z = a - b;
            return (z);
        }

        static int Multiply(int a, int b) {
            int  z = a * b;
            return (z);
        }

        static int Divide(int a, int b) {
            int z = a / b;
            return (z);
        }
        public static void Mod(int a, int b)
        {
            int z=a%b;
            System.out.println(z);
        }
    }
    public static void main(String[] args) {
        int d = abc.Add(7, 5);
        int e = abc.Subtract(9, 8);
        int f = abc.Multiply(5, 4);
        int g = abc.Divide(8, 4);
        abc.Mod(10,2);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}

