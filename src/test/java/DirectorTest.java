import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Ben","R1235JR",3450,"C-level", 345098);
    }

    @Test
    public void canGetName(){
        assertEquals("Ben",director.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("R1235JR",director.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(3450,director.getSalary(),0.0);
    }
    @Test
    public void canGetDept(){
        assertEquals("C-level",director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(345098,director.getBudget());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(100);
        assertEquals(3550, director.getSalary(),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(34.50, director.payBonus(),0.00);
    }

    @Test
    public void canPreventNegativeRaise(){
        director.raiseSalary(-50);
        assertEquals(3450, director.getSalary(),0.00);
    }


}
