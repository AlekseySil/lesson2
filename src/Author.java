import java.util.Objects;

public class Author {
    private String author;

    public Author (String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author1 = (Author) o;
        return Objects.equals(getAuthor(), author1.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor());
    }
}
