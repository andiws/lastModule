import java.util.*;


public class NormalizeText {
    public static void main(String[] args) {

//Part 1 - Normalize Text

        String s1="This is some \\\"really\\\" great. (Text)!?";
        String replaceString=s1.replaceAll("\\s", "");//replaces all occurrences of spaces
        String replaceString1 = s1.replaceAll("[.,:;'\"!?()\\\\]", "");
        String replaceString2 = s1.toUpperCase();

        System.out.println(replaceString);
        System.out.println(replaceString1);
        System.out.println(replaceString2);

//Part 2 - Caesar Cipher
        caesarify();

        shiftAlphabet();

//Part 3 - Codegroups

        groupify();

//Part 4 - Putting it all together

        encryptString(); 

//Part 5 - Hacker Problem - Decrypt

        ungroupify();

        decryptString();

    }


    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    private static void caesarify() {
    }
    private static void decryptString() {
    }

    private static void groupify() {
    }

    private static void ungroupify() {
    }

    private static void encryptString() {
    }




}