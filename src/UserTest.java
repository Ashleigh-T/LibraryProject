package src;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class UserTest {

    // Makes sure this test file is working 
    @Test
    public void test(){
        Assert.assertEquals(1,1);
    }

    // CONSTRUCTORS TESTS

    // tests basic constructors and test the .equals method 
    @Test
    public void constructorTest(){
        User a = new 
            User(1, "Ashleigh", "Taylor", 0);
        
        User b = new 
            User(1,"Ashleigh","Taylor",2);

        assertTrue(a.equals(b));

        User c = new User(2,"Sarah","Taylor", 0);
        User d = new User(1, "sarah", "Taylor", 0);

        assertFalse(a.equals(c));
        assertFalse(c.equals(d));

        User e = new User(a);

        assertTrue(e.equals(a));
    }

    // METHODS TESTS 

    // tests getID method 
    @Test
    public void getIDTest(){
        User a = new 
            User(1, "Ashleigh", "Taylor", 0);

        User b = new 
            User(2,"Sarah","Taylor",2);

        assertTrue(a.getID() == 1);
        assertTrue(b.getID() == 2);

    }

    // tests getFN method 
    @Test
    public void testGetFN(){
        User a = new 
            User(1, "Ashleigh", "Taylor", 0);
        User b = new 
            User(2,"Sarah","Taylor",2);


        assertTrue(a.getFN().equals("Ashleigh"));
        assertTrue(b.getFN().equals("Sarah"));
        assertFalse(a.getFN().equals(b.getFN()));

    }

    // tests getLN method 
    @Test
    public void testGetLN(){
        User a = new 
            User(1, "Ashleigh", "Taylor", 0);
        User b = new 
            User(2,"Sarah","Taylor",2);
        User c = new 
            User(3,"Jonas","Hosmer",0);

        assertTrue(a.getLN().equals(b.getLN()));
        assertFalse(a.getLN().equals(c.getLN()));
        assertFalse(b.getLN().equals(c.getLN()));

    }

    // tests getAcess and changeAcess methods 
    @Test
    public void testGetAcess(){
        User a = new 
            User(1, "Ashleigh", "Taylor", 0);
        User b = new 
            User(2,"Sarah","Taylor",2);
        User c = new 
            User(3,"Jonas","Hosmer",1);
        User d = new 
            User(4,"Alec","Zazlav",1);

        assertTrue(a.getAcess() == 0);
        assertTrue(b.getAcess() == 2);
        assertTrue(c.getAcess() == 1);
        assertTrue(c.getAcess() == d.getAcess());

        a.changeAcess(3);
        c.changeAcess(3);

        assertTrue(a.getAcess() == 3);
        assertTrue(c.getAcess() == 3);
        assertTrue(a.getAcess() == c.getAcess());

    }
}
