import java.util.*;


public class NormalizeText {
    public static void main(String[] args) {

//
//        Scanner phoneInput = new Scanner(System.in);
//        String getPhone = phoneInput.next();
//        System.out.println(getPhone);

        String s1="This is some \\\"really\\\" great. (Text)!?";
        String replaceString=s1.replaceAll("\\s", "");//replaces all occurrences of spaces
        String replaceString1 = s1.replaceAll("[.,:;’”!?()]", "");
        String replaceString2 = s1.toUpperCase();

        System.out.println(replaceString);
        System.out.println(replaceString1);
        System.out.println(replaceString2);


    }
}