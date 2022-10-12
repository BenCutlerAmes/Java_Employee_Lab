import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Geoff","5th5th",84765);
    }

    @Test
    public void canGetName(){
        assertEquals("Geoff",databaseAdmin.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("5th5th",databaseAdmin.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(84765,databaseAdmin.getSalary(),0.0);
    }



}
