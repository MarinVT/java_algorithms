package advanceLessonsAlgorithm.bookOBJ;

public class BookShelf {
    public static void main(String[] args) {
        Book book1, book2, book3;

        book1 = new Book("Programming in Java 1", "Marin1", "MarinIgrata1", "Test1 2004");
        book2 = new Book("Programming in Java 2", "Marin2", "MarinIgrata2", "Test2 2006");
        book3 = new Book("Programming in Java 3", "Marin3", "MarinIgrata3", "Test3 2008");

        book3.setTitle("Igrata12313123");
        book1.setPublisher("121111111");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
