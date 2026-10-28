import java.util.Arrays;
public class Main14 {
   public static void main(String[] args) {
    String s = "listen";
    String t = "silent";
char[] a = s.toCharArray();
char[] b = t.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
boolean anagram = Arrays.equals(a, b);
System.out.println("anagram: " + anagram);
    }
}