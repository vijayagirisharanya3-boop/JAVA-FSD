import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "eccto";
        String s2 = "techo";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}