package imran.builder;

abstract class BookBuilder {

    protected Book book;

    public void createBook() {
        this.book = new Book();
    }

    public Book getBook() {
        return book;
    }

    abstract void setGenre();

    abstract void addAuthor();

    abstract void setTitle();
}
