import java.util.Objects;

public class Book {
    private String titlee;
    private int year;
    private Author author;

    public Book (Author author, String title, int year){
        this.author = author;
        this.titlee = title;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return titlee;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titlee='" + titlee + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYear() == book.getYear() && Objects.equals(titlee, book.titlee) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(titlee, getYear(), getAuthor());
    }
}


