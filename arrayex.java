import java.util.ArrayList;

public class arrayex {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10); arr.add(20); arr.add(30); arr.add(1,40);
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        System.out.println(arr.isEmpty()); //boolean value
        arr.remove(2);
        System.out.println(arr.get(1));

        ArrayList<String> al = new ArrayList<String>();
        al.add("Bengaluru"); al.add("Mangaluru"); al.add("Mysuru");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        al.add(0,"namma");
        System.out.println(al);
        System.out.println(al.get(1));
        al.remove(3);
        System.out.println(al);



    }
}
