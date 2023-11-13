package for_prpgrammer;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello World!!!";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.contains("A"));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("Wold"));
        System.out.println(str.repeat(3));
        System.out.println(str.replace("e","*"));
    }
}
