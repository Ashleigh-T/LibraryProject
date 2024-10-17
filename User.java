public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int acess;

    public User(int id, String firstName, String lastName, int acess){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.acess = acess;

    }

    public User(User other){
        this.id = other.id;
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.acess = other.acess;
    }
}
