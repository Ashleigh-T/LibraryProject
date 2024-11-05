import java.util.HashMap;


public class Student extends User{
    
    private int grade;
        /* using the Integer class not int for values because HashMaps need
            classes and objects not primatives 
        */
    private HashMap<Integer><Book> books = new HashMap<Integer><Book>;
    private int readingLevel;
    

    //basic constructor
    public Student(int id, String firstName, String lastName, int acess,
                    int grade, int readingLevel){
        super(id,firstName,lastName,acess);
        this.grade = grade;
        this.readingLevel = readingLevel;
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
        if(books.size() >= 5 && book.readingLevel > this.readingLevel){
            return false;
        } else{
            books.put(Integer(book.ISBN),book);
            return true;
        }
    }

}
