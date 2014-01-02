package imran.builder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookStoreTest {

    private BookStore bookStore;
    private Publisher publisher;

    @Before
    public void setup() {
        publisher = new Publisher();
    }

    @Test
    public void shouldReturnHarryPotterBook_WhenCreatedThroughBuilder() {
        // given
        bookStore = new BookStore(publisher, new HarryPotterBookBuilder());
        String expected = "Harry Potter - Children fiction - [J K Rowling]";

        // when
        Book harryPotterBook = bookStore.getHarryPotterBook();

        // then
        assertThat(harryPotterBook.toString(), is(expected));
    }

    @Test
    public void shouldReturnQuranBook_WhenCreatedThroughBuilder() {
        // given
        bookStore = new BookStore(publisher, new QuranBookBuilder());
        String expected = "Quran - Religion - [Allah]";

        // when
        Book quranBook = bookStore.getQuranBook();

        // then
        assertThat(quranBook.toString(), is(expected));
    }
}
