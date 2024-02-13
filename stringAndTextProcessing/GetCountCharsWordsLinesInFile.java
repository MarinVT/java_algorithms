package stringAndTextProcessing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetCountCharsWordsLinesInFile {

    static String path = "C:\\Users\\acer\\Documents\\test1Java.txt";

    public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String currentLine = bufferedReader.readLine().trim();

            while (currentLine != null) {
                lineCount++;

                // words:
                String words[] = currentLine.split(" ");
                wordCount = wordCount + words.length;

                // line:
                for (String word : words) {
                    charCount = charCount + word.length();
                }

                currentLine =bufferedReader.readLine();
            }

            System.out.println("Total lines are: " + lineCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Total number of chars: " + charCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
