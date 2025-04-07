package src;

import java.util.LinkedList;

public class Book{

    private String title;
    private String author;
    private int ISBN;
    private int readingLevel;
    private String status;
    private LinkedList<Student> students;

    //CONSTRUCTORS

    // most general constructor 
    public Book(String title, String author, int ISBN, int readingLevel){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.readingLevel = readingLevel;
        this.status = "In";
        this.students = new LinkedList<Student>();
    }

    // costructor where we havent evaluated the readingLevel 
    public Book(String title, String author, int ISBN){
        this(title,author,ISBN, -1);
    }

    //METHODS
    // returns the reading level of the book
    public int getReadingLevel(){
        return this.readingLevel;
    }

    // returns the ISBN of the book 
    public int getISBN(){
        return this.ISBN;
    }

    // returns "Out" if book is not in the library and "In" otherwise 
    public String getStatus(){
        return this.status;
    }

    // Changes status to "Out" and adds the student to the students Linked List
    public void checkOut(Student student){
        this.status = "Out";
        this.students.addFirst(student);
    }

    // Changes status to "In"
    public void returnBook(){
        this.status = "In";
    }

    public LinkedList listOfStudents(){
        return new LinkedList<Student>(this.students);
    }

    //OVERRIDES

    // Overridng the object .equals method to work for this specific class 
    @Override
    public boolean equals(Object other){

        if(!(other instanceof Book) ){
            return false;
        }

        Book book = (Book)other;

        return(title.equals(book.title) && author.equals(book.author) &&
                ISBN == book.ISBN);

    }



}