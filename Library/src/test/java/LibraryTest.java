import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Dry");
        book2 = new Book("Into the Wild");
    }

    @Test
    public void hasStock(){
        assertEquals(0, library.countStock());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.countStock());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void cannotAddOverCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countStock());
    }


    @Test
    public void canFindBook(){
        library.addBook(book);
        library.addBook((book2));
        assertEquals(1, library.findBookIndex(book2));
    }

    @Test
    public void bookIsCollected(){
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.countStock());
    }
}

