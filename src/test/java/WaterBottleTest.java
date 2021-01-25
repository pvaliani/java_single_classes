import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

//initialise waterBottle for testing purposes
    WaterBottle waterBottle;


    @Before
    public void setUp(){
        waterBottle = new WaterBottle(100);
    }

// test water bottle has a volume and that it is 100
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(90,waterBottle.getVolume());
    }

    @Test
    public void canRepeatDrink(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }


}
