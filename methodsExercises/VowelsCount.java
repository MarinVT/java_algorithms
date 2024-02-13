package methodsExercises;

    import java.util.Scanner;

    public class VowelsCount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String text = scanner.nextLine();
            System.out.println(vowelsCount(text));
        }

        public static int vowelsCount(String word) {
            int counter = 0;

            String strToLowerCase = word.toLowerCase();

            for (int i = 0; i < strToLowerCase.length(); i++) {

                if (strToLowerCase.charAt(i) == 'a') {
                    counter++;
                } else if (strToLowerCase.charAt(i) == 'e') {
                    counter++;
                } else if (strToLowerCase.charAt(i) == 'o') {
                    counter++;
                } else if (strToLowerCase.charAt(i) == 'u') {
                    counter++;
                } else if (strToLowerCase.charAt(i) == 'i') {
                    counter++;
                }
            }

            return counter;
        }
    }
