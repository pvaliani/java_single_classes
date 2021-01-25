import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.65, 'm');
    }


    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.65, bear.getWeight(), 0.00);
    }

    @Test
    public void readyToHibernate_true(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void readyToHibernate_false(){
        Bear thinBear = new Bear("Baloo", 65, 50.88, 'm');
        assertEquals(false, thinBear.readyToHibernate());
    }

//    char type: give your bear a gender m or f

    @Test
    public void hasGender(){
        assertEquals('m', bear.getGender());
    }

}
