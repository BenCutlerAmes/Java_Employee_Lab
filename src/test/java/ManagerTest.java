import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dave","37LP",450000,"HR");
    }

    @Test
    public void canGetName(){
        assertEquals("Dave",manager.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("37LP",manager.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(450000,manager.getSalary(),0.0);
    }
    @Test
    public void canGetDept(){
        assertEquals("HR",manager.getDeptName());
    }



}
