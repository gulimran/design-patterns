package imran.builder;

public class QuranBookBuilder extends BookBuilder {

    @Override
    void setGenre() {
        book.setGenre("Religion");
    }

    @Override
    void addAuthor() {
        book.addAuthor("Allah");
    }

    @Override
    void setTitle() {
        book.setTitle("Quran");
    }


}
