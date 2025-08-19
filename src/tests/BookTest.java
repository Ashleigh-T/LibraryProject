<<<<<<<< HEAD:src/test/BookTest.java
package src.test;
========
package src.tests;
>>>>>>>> 372c6d7 (reorginized file structure):src/tests/BookTest.java

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;

import org.junit.*;

import src.Book;
import src.Student;

public class BookTest {

    // Makes sure this test file is working 
    @Test
    public void test(){
        Assert.assertEquals(1,1);
    }

    // CONSTRUCTOR TESTS 

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

        Book e = new Book(a);

        assertTrue(e.equals(a));
        
    }

    // TESTS METHODS 

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

    @Test
    public void checkOutAndReturnBookTest(){
        Book a = new Book("Throne Of Glass", "Sarah .J Mass",
        123, 6);

        assertTrue(a.getStatus().equals("In"));

        Student b = new Student(1,"Ashleigh","Taylor",
                                 0, 12, 12);

        a.checkOut(b);

        assertTrue(a.getStatus().equals("Out"));

        a.returnBook();

        assertTrue(a.getStatus().equals("In"));

    }

    @Test
    public void listOfStudents(){
        Book a = new Book("Throne Of Glass", "Sarah .J Mass",
                             123, 6);

        Student b = new Student(1,"Ashleigh","Taylor",
                                 0, 12, 12);

        Student c = new Student(2,"Sarah","Taylor",
                                 0, 12, 12);
        
        Student d = new Student(3,"Daniel","Taylor",
                                 0, 12, 12);

        a.checkOut(b);
        a.returnBook();

        a.checkOut(c);
        a.returnBook();

        a.checkOut(d);
        a.returnBook();

        assertTrue(a.listOfStudents().contains(b));
        assertTrue(a.listOfStudents().contains(c));
        assertTrue(a.listOfStudents().contains(d));
    }

    // Tests mutablility of object instance vars 
    @Test
    public void mutablitiyTest(){
        Book a = new Book("Throne Of Glass", "Sarah .J Mass",
                             123, 6);

        Student b = new Student(1,"Ashleigh","Taylor",
                                 0, 12, 12);

        a.checkOut(b);

        assertTrue(a.listOfStudents().contains(b));

        LinkedList list = a.listOfStudents();

        list.clear();

        assertTrue(a.listOfStudents().contains(b));

    }
}
