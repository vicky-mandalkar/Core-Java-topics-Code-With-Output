/*
✅ Q19. Replace Vowels in Each Word with Increasing Count

Problem: In each word, replace vowels with increasing count (starting from 1 per word).

Input: hello i am java developer

Output: h1ll2 1 1m j1v2 d1v2l3p4r
*/
class VowelWithNumber {

    static void vowel(String words[]) {
        // FIXED: Loop through all words (removed the "- 1")
        for (int i = 0; i < words.length; i++) {
            int count = 1;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);

                // FIXED: Checked both uppercase and lowercase vowels
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.print(count);
                    count++;
                } else {
                    System.out.print(ch);
                }
            }
            
            // Print space after each word, except the very last one
            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Newline at the end
    }

    public static void main(String args[]) {
        // FIXED: Removed .toUpperCase() to preserve the lower case output format
        String sentence = "hello i am java developer";
        String words[] = sentence.split(" ");

        vowel(words);
    }
}
