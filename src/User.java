package src;
public class User {

    // basic information for a user 
    private int id;
    private String firstName;
    private String lastName;
    private int acess;

    // CONSTRUCTORS
    // basic constructor 
    public User(int id, String firstName, String lastName, int acess){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.acess = acess;

    }

    // basic copy constructor 
    public User(User other){
        this(other.id, other.firstName, other.lastName, other.acess);
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

    // OVERRIDES

    // Overridng the object .equals method to work for this specific class 
    @Override
    public boolean equals(Object other){

        if(!(other instanceof User) ){
            return false;
        }

        User user= (User)other;

        return(id == user.id && firstName.equals(user.firstName) &&
                lastName.equals(user.lastName));

    }
}
