package src;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class BookTest {

    // Makes sure this test file is working 
    @Test
    public void test(){
        Assert.assertEquals(1,1);
    }

    //tests basic constructors and tests the .equals method
    @Test
    public void constructorTest(){
        Book a = new 
            Book("Throne Of Glass", "Sarah .J Mass", 123);
        Book b = new 
            Book("Throne Of Glass", "Sarah .J Mass", 123);

        assertTrue(a.equals(b));

        Book c = new Book("Throne Of Glass", "Sarah .J Mass",
                 123, 6);

        assertTrue(a.equals(c));
        assertTrue(b.equals(c));

        Book d = new Book("Throne Of Glass", "Sarah .J Mass",
                             456, 6);

        assertFalse(a.equals(d));
        assertFalse(b.equals(d));
        assertFalse(c.equals(d));
        
    }

    /*
     * Tests the getReading Test method and the allocation of -1 to books with
     * no reading level added in construction 
     */
    @Test
    public void readingLevelTest(){
        Book a = new Book("Throne Of Glass", "Sarah .J Mass",
                             123, 6);

        assertTrue(a.getReadingLevel() == 6);

        Book b = new Book("The Way Of Kings", "Brandon Sanderson",
                             456, 8);

        assertTrue(b.getReadingLevel() == 8);

        assertFalse(a.getReadingLevel() == b.getReadingLevel());

        Book c = new Book("Throne Of Glass", "Sarah .J Mass",
                             123);

        assertTrue(c.getReadingLevel() == -1);

        Book d = new Book("Throne Of Glass", "Sarah .J Mass",
                             123);

        assertTrue(c.getReadingLevel() == d.getReadingLevel());

    }


    // Tests .getISBN()
    @Test
    public void ISBNTest(){
        Book a = new Book("Throne Of Glass", "Sarah .J Mass",
                             123, 6);

        assertTrue( a.getISBN() == 123);

        Book b = new Book("The Way Of Kings", "Brandon Sanderson",
                             456, 8);

        assertTrue(b.getISBN() == 456);
        
        assertTrue(a.getISBN() != b.getISBN());
    }
}
