public class varargs_ex {
    public int prod(int ...arr){
        int product=1;
        System.out.print("Array value ");
        for (int i=0;i<arr.length;i++){
            product=product*arr[i];
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        System.out.println("Number of Value sent are: " + arr.length);
        return product;
    }

    public static void main(String[] args) {
        varargs_ex v= new varargs_ex();
        System.out.println(v.prod(3,6,7,8,9,99));
    }
}

