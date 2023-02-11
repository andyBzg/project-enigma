import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String original = "Привет, мир";
        String cipher = "евирпим, тр";
        String longString = "Привет, мир! Этот код умеет переворачивать строки и шифровать сообщение =)";
        String longReversedString = "евирПим ,ттЭ !рок тоему деп тероверавичатс ьт икорфиш итавороос ьинещб)= е";

        List<String> result = splitToSubstrings(longReversedString);

        String resultText = reverseStrings(result);
        System.out.println(resultText);

    }


    private static List<String> splitToSubstrings(String string) {

        int substringStep = 5;
        int length = string.length();

        List<String> splitStrings = new ArrayList<>();

        for (int i = 0; i < length; i += substringStep) {
            splitStrings.add(string.substring(i, Math.min(length, i + substringStep)));
        }

        return splitStrings;
    }


    private static String reverseStrings(List<String> strings) {

        List<String> reversedlist = new ArrayList<>();

        for (String string : strings) {
            reversedlist.add(decryptStrings(string));
        }

        String result = "";

        for (String s : reversedlist) {
            result += s;
        }

        return result;
    }


    private static String decryptStrings(String string) {

        int length = string.length();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(string.charAt(i));
        }

        Stack<Character> stack = new Stack<>();
        for (Character character : list) {
            stack.push(character);
        }

        List<Character> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            char element = stack.pop();
            result.add(element);
        }

        String resultStr = "";
        for (Character character : result) {
            resultStr += character;
        }

        return resultStr;
    }
}
