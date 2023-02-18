package encrypted.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringEncrypt {

    public static String encrypt(String string) {

        int substringStep = 5;
        int length = string.length();

        List<String> splittedStrings = new ArrayList<>();

        for (int i = 0; i < length; i += substringStep) {
            splittedStrings.add(string.substring(i, Math.min(length, i + substringStep)));
        }

        String encryptedString = buildEncryptedString(splittedStrings);

        return encryptedString;
    }


    private static String buildEncryptedString(List<String> strings) {

        List<String> reversedStrings = new ArrayList<>();

        for (String string : strings) {
            reversedStrings.add(reverseStrings(string));
        }

        String finalStr = "";

        for (String string : reversedStrings) {
            finalStr += string;
        }

        return finalStr;
    }


    private static String reverseStrings(String string) {

        int length = string.length();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            stack.push(string.charAt(i));
        }

        List<Character> inversion = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            char element = stack.pop();
            inversion.add(element);
        }

        String resultStr = "";
        for (Character character : inversion) {
            resultStr += character;
        }
        return resultStr;
    }
}
