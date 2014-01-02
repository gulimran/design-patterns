package imran.builder;

public class BookStore {

    private Publisher publisher;
    private HarryPotterBookBuilder harryPotterBookBuilder;
    private QuranBookBuilder quranBookBuilder;

    public BookStore(Publisher publisher, HarryPotterBookBuilder harryPotterBookBuilder) {
        this.publisher = publisher;
        this.harryPotterBookBuilder = harryPotterBookBuilder;
    }

    public BookStore(Publisher publisher, QuranBookBuilder quranBookBuilder) {
        this.publisher = publisher;
        this.quranBookBuilder = quranBookBuilder;
    }

    public Book getHarryPotterBook() {
        publisher.setBookBuilder(harryPotterBookBuilder);
        publisher.buildBook();
        return publisher.getBook();
    }

    public Book getQuranBook() {
        publisher.setBookBuilder(quranBookBuilder);
        publisher.buildBook();
        return publisher.getBook();
    }
}
