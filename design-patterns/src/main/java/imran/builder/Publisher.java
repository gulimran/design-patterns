package imran.builder;

/**
 * Director
  */
public class Publisher {

    private BookBuilder bookBuilder;

    public void setBookBuilder(BookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }

    public Book getBook() {
        return bookBuilder.getBook();
    }

    public void buildBook() {
        bookBuilder.createBook();
        bookBuilder.setGenre();
        bookBuilder.setTitle();
        bookBuilder.addAuthor();
    }
}
