package imran.builder;

public class HarryPotterBookBuilder extends BookBuilder {

    @Override
    void setGenre() {
        book.setGenre("Children fiction");
    }

    @Override
    void addAuthor() {
        book.addAuthor("J K Rowling");
    }

    @Override
    void setTitle() {
        book.setTitle("Harry Potter");
    }


}
