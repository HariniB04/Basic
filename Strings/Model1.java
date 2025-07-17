public class EncodePasswordModel2 {
    public static String[] splitWord(String word) {
        int n = word.length();
        int part1Len = n / 3;
        int part3Len = n / 3;
        int part2Len = n - (part1Len + part3Len);
        String part1 = word.substring(0, part1Len);
        String part2 = word.substring(part1Len, part1Len + part2Len);
        String part3 = word.substring(part1Len + part2Len);
        return new String[]{part1, part2, part3};
    }
    public static String createPassword(String word1, String word2) {
        String[] w1Parts = splitWord(word1);
        String[] w2Parts = splitWord(word2);
        return w2Parts[0] + w1Parts[0] + w1Parts[2] + w2Parts[2];
    }
    public static void main(String[] args) {
        String input1 = "WIPRO";
        String input2 = "TECHNOLOGIES";
        String password = createPassword(input1,input2);
        System.out.println("Generated Password: " + password);
        System.out.println("Generated Password: " + createPassword("MACHINE", "LEARNING"));
    }
}
