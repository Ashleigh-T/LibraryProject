
public class Student extends User{
    
    private int grade;
    //private Book[] books;
    
    public Student(int id, String firstName, String lastName, int acess, int grade){
        super(id,firstName,lastName,acess);
        this.grade = grade;
    }

    public Student(Student other){
        super(other);
        this.grade = other.grade;
    }

}
