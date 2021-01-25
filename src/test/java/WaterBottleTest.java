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

// test water bottle has a volume
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }


}
