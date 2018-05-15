import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Dry");
    }

    @Test
    public void hasName(){
        assertEquals("Dry", book.getName());
    }
}
