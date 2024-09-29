public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy Dog";
        System.out.println(isPangram(sentence) ? 1 : -1);
    }

    public static boolean isPangram(String sentence) {
        // Convert the sentence to lowercase
        sentence = sentence.toLowerCase();

        // Loop from 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // Check if the sentence contains each letter
            if (!sentence.contains(String.valueOf(c))) {
                return false;  // Return false if any letter is missing
            }
        }
        return true;  // Return true if all letters are found
    }
}
