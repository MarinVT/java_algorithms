package objectAndClasses;

import java.util.Scanner;

public class Articles {

    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");

        Articles articles = new Articles(data[0], data[1], data[2]);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(": ");
            String command = tokens[0];

            if (command.equals("Edit")) {
                articles.edit(tokens[1]);
            } else if (command.equals("ChangeAuthor")) {
                articles.changeAuthor(tokens[1]);
            } else {
                articles.rename(tokens[1]);
            }
        }

        System.out.println(articles.toString());
    }
}
