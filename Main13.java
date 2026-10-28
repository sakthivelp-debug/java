public class Main13 {
    public static void main(String[] args) {
        String s = "hello world";
        int vowels = 0, consonants = 0;
for (int i = 0; i < s.length(); i++) {
char ch = Character.toLowerCase(s.charAt(i));
if (ch >= 'a' && ch <= 'z') {
if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') {vowels++;
 } else {
         consonents++;
                }
            }
        }
System.out.println("Vowels: " + vowels); System.out.println("Consonants: " + consonants);
    }
}