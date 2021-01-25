import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    @Test
    public void canGetPlanetName(){

        Planet planet = new Planet("Earth", 393292);
        assertEquals("Earth", planet.getName());

    }

    @Test
    public void canExplodePlanet(){
        Planet planet = new Planet("Moon", 324523);
        String returned = planet.explode();
        assertEquals("Planet Moon has went boom", returned);
    }
}
