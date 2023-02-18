package encrypted.strings;

public class Main {
    public static void main(String[] args) {

        String original = "Привет, мир";
        String reversedOrder = "евирпим, тр";
        String originalString = "Привет, мир! Этот код умеет переворачивать строки и шифровать сообщение =)";
        String encryptedString = "евирПим ,ттЭ !рок тоему деп тероверавичатс ьт икорфиш итавороос ьинещб)= е";


        String resultText = StringEncrypt.encrypt(encryptedString);
        System.out.println(resultText);

    }
}
