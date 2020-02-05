package people;

import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster rollerCoaster;

    @Before
    public void before() {
        visitor = new Visitor(14, 1.2, 40.0);
        rollerCoaster = new RollerCoaster("Big Kahuna", 3);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    // Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions and a method to add an attraction to the list.

    @Test
    public void canAddAttractionToArrayOfVisistedAttractions() {
        visitor.addAttractionToVisitedAttractions(rollerCoaster);
        assertEquals(1, visitor.getSizeOfVisitedAttractions());
    }
}
