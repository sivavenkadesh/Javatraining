package javalearning;

public class PrintLongestStringword {
    public static void main(String args[]) {
        String sentence = "This is a test sentence";

        System.out.println("Longest string is " + longestString(sentence));


    }

    private static String longestString(String sentence) {
        // TODO: Write your code here
        String finalString = "";
        String innerString = "";
        for (int i = 0; i < sentence.length(); i++) {


            if (i == 0 && sentence.charAt(i) == ' ') {
                i++;
                continue;
            }

            if (sentence.charAt(i) != ' ') {
                innerString += sentence.charAt(i);
                if (i==sentence.length()-1)
                {
                    if (finalString.length() < innerString.length()) {
                        finalString = innerString;
                    }
                }

            } else if (sentence.charAt(i) == ' ' ) {
                if (finalString.length() < innerString.length()) {
                    finalString = innerString;
                }
                innerString = "";
            }
        }
        return finalString;
    }
}

