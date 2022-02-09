package ie.gmit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengersTest {
    private Passengers pass;

    @Test
    void testConstructorTitle()
    {
        pass = new Passengers("Mr", "Stephen", "894rtho409235","0987076831", 20);
        assertEquals("Mr", pass.getPassTitle());
    }

    @Test
    void testConstructorInvalidTitle()
    {
        final String invalid = "Invalid title provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,
                ()-> new Passengers("Miss", "Stephen", "894rtho409235","0987076831", 20));
        assertEquals(invalid, exceptionThrown.getMessage());
    }
}
