package src;
import java.util.ArrayList;

public class Student extends User{
    
    private int grade;
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

    // returns the ArrayList of books the student has checked out
    public ArrayList<Book> getBooks(){
        return new ArrayList<Book>(this.books);
    }

    // returns the grade of the student
    public int getGrade(){
        return this.grade;
    }

    // returns the reading level of the student
    public int getReadingLevel(){
        return this.readingLevel;   
    }

    // returns true if grade is changed and false if not
    public boolean setGrade(int newGrade){
        this.grade = newGrade;
        return(this.grade == newGrade);
    }

    //returns true if reading level is changed and false if not
    public boolean setReadingLevel(int newLevel){
        this.readingLevel = newLevel;
        return(this.readingLevel == newLevel);
    }

}
