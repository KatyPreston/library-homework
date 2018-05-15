import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReaderTest {

    Library library;
    Book book;
    Reader reader;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Dry");
        reader = new Reader("Luis");
    }

    @Test
    public void hasName(){
        assertEquals("Luis", reader.getName());
    }

    @Test
    public void hasBooks(){
        assertEquals(0, reader.countCollection());
    }

    @Test
    public void canCollectBook(){
        reader.collectBook(book);
        assertEquals(1, reader.countCollection());
    }

    @Test
    public void getBookFromLibrary(){
        library.addBook(book);
        reader.collectsBookFromLibrary(library, book);
        assertEquals(1, reader.countCollection());
        assertEquals(0, library.countStock());
    }
}
