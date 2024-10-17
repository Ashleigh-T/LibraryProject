public class User {

    // basic information for a user 
    private int id;
    private String firstName;
    private String lastName;
    private int acess;

    // basic constructor 
    public User(int id, String firstName, String lastName, int acess){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.acess = acess;

    }

    //basic copy constructor 
    public User(User other){
        this.id = other.id;
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.acess = other.acess;
    }

    // METHODS  
    // returns the id of the current user 
    public int getID(){
        return this.id;
    }

    // returns the firstName of the current user 
    public String getFN(){
        return this.firstName;
    }

    // returns the lastName of the current user 
    public String getLN(){
        return this.lastName;
    }

    // returns the acess level of the current user 
    public int getAcess(){
        return this.acess;
    }

    // Changes the acess of the current user 
    public void changeAcess(int newAcess){
        this.acess = newAcess;
    }
}
