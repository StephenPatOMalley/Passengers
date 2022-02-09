package ie.gmit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengersTest {
    private Passengers pass;

    @Test
    void testConstructorTitle()
    {
        pass = new Passengers("Mr");
        assertEquals("Mr", pass.getPassTitle());
    }
}
