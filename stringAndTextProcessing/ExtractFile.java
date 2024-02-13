package stringAndTextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String[] fileInfo = path.substring(path.lastIndexOf("\\" ) + 1).split("\\.");
        String fileName = fileInfo[0];
        String extension = fileInfo[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", extension);
    }
}
