public class stringcommands {
    public static void main(String[] args) {
        String str = "meghna";
        String str2 = "madhan";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str2);
        System.out.println(str2.replace(str2, str));
        System.out.println(str.charAt(4));
        String str3 = "MEGHNA S";
        String str4 = "meghna s";
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

    }

}
