public class ValidSentence {

    public String processSentence(String sentence) {
        String str = sentence.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !((str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))) {
                return "Welcome! Enjoy 123 is an invalid sentence";
            }
        }

        String ans = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != 'a' && str.charAt(i) != 'e' && 
                str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                ans += str.charAt(i);
                count++;
            }
        }
        if (count == 0) {
            return "No consonants present in the sentence!";
        }
        return "The output string is " + ans + count;
    }

    public static void main(String[] args) {
        String sentence = "Hello world";
        ValidSentence obj = new ValidSentence();
        System.out.println(obj.processSentence(sentence)); // Print the result
    }
}