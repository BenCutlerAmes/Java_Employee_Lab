import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steve","4",1234);
    }

    @Test
    public void canGetName(){
        assertEquals("Steve",developer.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("4",developer.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(1234,developer.getSalary(),0.0);
    }



}
