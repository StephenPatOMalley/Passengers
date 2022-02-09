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

    @Test
    void testConstructorName()
    {
        pass = new Passengers("Mr", "Stephen", "894rtho409235","0987076831", 20);
        assertEquals("Stephen", pass.getPassName());
    }

    @Test
    void testConstructorInvalidName()
    {
        final String invalidName = "Invalid name provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,
                ()-> new Passengers("Mr", "Po", "894rtho409235","0987076831", 20));
        assertEquals(invalidName, exceptionThrown.getMessage());
    }

    @Test
    void testConstructorID()
    {
        pass = new Passengers("Mr", "Stephen", "894rtho409235","0987076831", 20);
        assertEquals("894rtho409235", pass.getPassID());
    }

    @Test
    void testConstructorInvalidID()
    {
        final String invalidID = "Invalid ID provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,
                ()-> new Passengers("Mr", "Potato", "45326","0987076831", 20));
        assertEquals(invalidID, exceptionThrown.getMessage());
    }
}
