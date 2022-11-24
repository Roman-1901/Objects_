import java.util.Objects;

public class Book {
    private String nameBook;
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

        @Override
    public String toString() {
        return "Название книги: "+ nameBook + ", Автор: " + author + ", Год издания: " + year;
    }


        @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
            return nameBook.equals(book.nameBook) && author == book.author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }

}


