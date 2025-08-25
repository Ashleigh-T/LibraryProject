package src.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import src.Student;
import src.Book;

public class StudentTest {

    // Makes sure this test file is working 
    @Test
    public void test(){
        Assert.assertEquals(1,1);
    }

    // Constructors Tests

    // tests both the basic and copy constructor
    @Test
    public void constructorTest(){
        Student a = new 
            Student(1,"Ashleigh",
                    "Taylor",1,12,5);
        
        Student c = new Student(a);

        Student b = new 
            Student(2,"Sarah",
                    "Taylor",1,11,4);

        Student d = new Student(2,"Sarah","Taylor",3,4,1);

        assertTrue(a.equals(c));
        assertTrue(b.equals(d));
        assertFalse(a.equals(d));
        assertFalse(c.equals(b));

    }

    // Methods Tests

    // tests the checkOutBook and returnBook methods
    @Test
    public void checkOutReturnTest(){
        Student a = new 
            Student(1,"Ashleigh",
                    "Taylor",1,12,5);
        Book b = new Book("Harry Potter", "J.K. Rowling", 4);
        Book c = new Book("War and Peace", "Leo Tolstoy", 6);
        Book d = new Book("The Great Gatsby", "F. Scott Fitzgerald", 5);
        Book e = new Book("1984", "George Orwell", 3);
        Book f = new Book("To Kill a Mockingbird", "Harper Lee", 2);
        Book g = new Book("The Catcher in the Rye", "J.D. Salinger", 4);
        
        assertTrue(a.checkOutBook(b));
        assertTrue(a.checkOutBook(c));
        assertTrue(a.checkOutBook(d));
        assertTrue(a.checkOutBook(e));
        assertTrue(a.checkOutBook(f));
        assertFalse(a.checkOutBook(g));

        assertTrue(a.getBooks().contains(b));
        assertTrue(a.getBooks().contains(c));
        assertTrue(a.getBooks().contains(d));
        assertTrue(a.getBooks().contains(e));
        assertTrue(a.getBooks().contains(f));
        assertFalse(a.getBooks().contains(g));

        a.returnBook(b);
        assertFalse(a.getBooks().contains(b));
        assertTrue(a.checkOutBook(g));
        assertTrue(a.getBooks().contains(g));

        a.returnBook(c);
        a.returnBook(d);
        a.returnBook(e);
        a.returnBook(f);
        a.returnBook(g);
        assertTrue(a.getBooks().isEmpty());
        
    }

    // tests the getGrade and setGrade methods
    @Test
    public void getAndSetGradeTest(){
        Student a = new Student(1,"Ashleigh",
                    "Taylor",1,12,5);

        assertTrue(a.getGrade() == 12);
        assertTrue(a.setGrade(11));
        assertTrue(a.getGrade() == 11);
        assertFalse(a.getGrade() == 12);
    }
    
    @Test
    public void getAndSetReadingLevelTest(){
        Student a = new Student(1,"Ashleigh",
                    "Taylor",1,12,5);

        assertTrue(a.getReadingLevel() == 5);
        assertTrue(a.setReadingLevel(0));
        assertTrue(a.getReadingLevel() == 0);
        assertFalse(a.getReadingLevel() == 5);
      
    }
}
