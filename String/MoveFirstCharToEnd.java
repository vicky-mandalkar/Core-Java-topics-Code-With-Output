/*
✅ Q18. Move First Character of Each Word to End of Sentence
Problem: Remove the first letter of each word and append them at the end.
Input: hello i am java developer
Output: ello m ava eveloperhiajd
*/

class MoveFirstCharToEnd {

    static void move(String words[]) {

        StringBuilder sb1 = new StringBuilder(); // Remaining characters
        StringBuilder sb2 = new StringBuilder(); // First characters

        for (int i = 0; i < words.length; i++) {

            // For words having more than one character
            if (words[i].length() > 1) {
                sb1.append(words[i].substring(1)).append(" ");
            }

            // Store the first character of every word
            sb2.append(words[i].charAt(0));
        }

        // Print remaining words + collected first characters
        System.out.println(sb1.toString() + sb2.toString());
    }

    public static void main(String args[]) {

        String sentence = "hello i am java developer";

        String words[] = sentence.split(" ");

        move(words);
    }
}/*
oellh   i ma    aavj    reveloped
*/