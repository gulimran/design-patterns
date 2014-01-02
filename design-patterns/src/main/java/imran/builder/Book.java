package imran.builder;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<String> authors;
    private String title;
    private String genre;

    public Book() {
        this.authors = new ArrayList<String>();
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " - " + genre + " - " + authors;
    }
}
