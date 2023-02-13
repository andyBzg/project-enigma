package encrypted.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringEncrypt {

    public static List<String> splitToSubstrings(String string) {

        int substringStep = 5;
        int length = string.length();

        List<String> splittedStrings = new ArrayList<>();

        for (int i = 0; i < length; i += substringStep) {
            splittedStrings.add(string.substring(i, Math.min(length, i + substringStep)));
        }

        return splittedStrings;
    }


    public static String buildEncryptedString(List<String> strings) {

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


    public static String reverseStrings(String string) {

        int length = string.length();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(string.charAt(i));
        }

        Stack<Character> stack = new Stack<>();
        for (Character character : list) {
            stack.push(character);
        }

        List<Character> reversedSubstrings = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            char element = stack.pop();
            reversedSubstrings.add(element);
        }

        String resultStr = "";
        for (Character character : reversedSubstrings) {
            resultStr += character;
        }

        return resultStr;
    }
}
