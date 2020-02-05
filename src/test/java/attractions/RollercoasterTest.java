package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 145, 20);
        visitor2 = new Visitor(13, 145, 20);
        visitor3 = new Visitor(23, 203, 20);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    // Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age

    @Test
    public void visitorCannotRide() { assertEquals(false, rollerCoaster.isAllowedTo(visitor1));}

    @Test
    public void visitorCanRide() { assertEquals(true, rollerCoaster.isAllowedTo(visitor2));}

    // Rollercoaster implements ITicketed and charges tall people over 200cm double fee

    @Test
    public void heightDiscriminationCharge() {assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.00);}

}
