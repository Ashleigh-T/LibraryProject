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
            User(2,"Ashleigh","Taylor",2);

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
}
