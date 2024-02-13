package advanceLessonsAlgorithm.bookOBJ;

public class Book {

    //    private variables
    private String _title;
    private String _author;
    private String _publisher;
    private String _copyright;

    public Book(String title, String author, String publisher, String copyright) {
        _title = title;
        _author = author;
        _publisher = publisher;
        _copyright = copyright;
    }

    //setters
    public String getTitle() { return _title; }
    public String getAuthor() { return _author; }
    public String getPublisher() { return _publisher; }
    public String getCopyright() { return _copyright; }

    //getters
    public void setTitle(String title) { _title = title; }
    public void setAuthor(String author) { _author = author; }
    public void setPublisher(String publisher) { _publisher = publisher; }
    public void setCopyright(String copyright) { _copyright = copyright; }

    public String toString() {
        return "Title: " + _title + "\n" + "Author: " + _author + "\n" +
                "Publisher: " + _publisher + "\nCopyright: " + _copyright + "\n\n";
    }
}
