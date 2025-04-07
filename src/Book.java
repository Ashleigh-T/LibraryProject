package src;

public class Book{

    private String title;
    private String author;
    private int ISBN;
    private int readingLevel;
    private String status;
    private Student student;

    // most general constructor 
    public Book(String title, String author, int ISBN, int readingLevel){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.readingLevel = readingLevel;
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