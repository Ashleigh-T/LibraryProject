package src;

import src.Student;
import src.Book;

public class Librarian extends User {
    
    // basic contrsuctor 
    public Librarian(int id, String firstName, String lastName, int acess){
        super(id, firstName, lastName, acess);
    }

    //METHODS 

    public boolean checkOut(Student student, Book book){
        return(student.checkOutBook(book));
    }

    

}
