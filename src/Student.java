package src;
import java.util.ArrayList;

public class Student extends User{
    
    private int grade;
        /* using the Integer class not int for values because HashMaps need
            classes and objects not primatives 
        */
    private ArrayList<Book> books;
    private int readingLevel;
    private int MAX_BOOKS = 5;
    

    //basic constructor
    public Student(int id, String firstName, String lastName, int acess,
                    int grade, int readingLevel){
        super(id,firstName,lastName,acess);
        this.grade = grade;
        this.readingLevel = readingLevel;
        this.books = new ArrayList<Book>();
    }

    //basic copy constructor 
    public Student(Student other){
        super(other);
        this.grade = other.grade;
        this.readingLevel = other.readingLevel;
    }

    //METHODS   
    // returns true if the book is added and false if the book is not added 
    public boolean checkOutBook(Book book){
        if(books.size() >= MAX_BOOKS ||
            book.getReadingLevel() > this.readingLevel){
            return false;
        } else{
            books.add(book);
            return true;
        }
    }

    // removes book from the list 
    public void returnBook(Book book){
       books.remove(book);
    }

}
