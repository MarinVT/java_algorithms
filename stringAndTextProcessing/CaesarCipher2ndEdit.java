package stringAndTextProcessing;

public class CaesarCipher2ndEdit {
    public static void main(String[] args) {
        System.out.println(cipherEncrypt("testone", 3));
    }

    public static String cipherEncrypt(String textMsg, int transform) {
        String str = "";

        for (int i = 0; i < textMsg.length(); i++) {
            char c = (char) (textMsg.charAt(i) + transform);
            if (c > 'z') {
                str += (char) (textMsg.charAt(i) -(26-transform));
            } else {
                str += (char) (textMsg.charAt(i) + transform);
            }
        }
        return str;
    }
}
