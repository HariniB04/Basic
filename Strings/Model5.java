import java.util.Scanner;
public class Model5 {
    public static String[] splitWord(String word) {
        int n = word.length();
        int base = n / 3;
        int extra = n % 3;
        int part1Len = base;
        int part2Len = base;
        int part3Len = base;
        if (extra == 1) {
            part2Len += 1;  // middle part gets 1 extra
        } else if (extra == 2) {
            part1Len += 1;  // first gets 1 extra
            part3Len += 1;  // last gets 1 extra
        }
        String part1 = word.substring(0, part1Len);
        String part2 = word.substring(part1Len, part1Len + part2Len);
        String part3 = word.substring(part1Len + part2Len);
        return new String[]{part1, part2, part3};
    }
    public static void createPassword(String word1, String word2) {
        String[] w1 = splitWord(word1);
        String[] w2 = splitWord(word2);
        String password = w2[0] + w1[0] + w1[2] + w2[2];
        System.out.println("Example: input1=\"" + word1 + "\" input2=\"" + word2 + "\"");
        System.out.println("Output should be \"" + password + "\"");
        System.out.println("Explanation -");
        System.out.println("The three parts of " + word1 + " will be \"" + w1[0] + "\", \"" + w1[1] + "\" and \"" + w1[2] + "\"");
        System.out.println("The three parts of " + word2 + " will be \"" + w2[0] + "\", \"" + w2[1] + "\", and \"" + w2[2] + "\"");
        System.out.println("So, Password = First part of word2 + First part of word1 + Third part of word1 + Third part of word2");
        System.out.println("= " + w2[0] + " + " + w1[0] + " + " + w1[2] + " + " + w2[2]);
        System.out.println("= " + password);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();
        createPassword(word1, word2);
        sc.close();
    }
}
