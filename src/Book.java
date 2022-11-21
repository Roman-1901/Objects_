public class Book {
    private final String nameBook;
    private final Author author;
    private int year;

    public Book(String nameBook, Author author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }
    public String getNameBook() {
        return nameBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
