import java.util.Arrays;

public class Anagram2 {
   
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "cba";

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
