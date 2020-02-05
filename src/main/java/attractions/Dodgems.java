package attractions;

import behaviours.ITicketed;
import people.Visitor;

// Dodgems implements ITicketed and charge half price to children under 12 years old, 4.50

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    Visitor visitor;

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    // Dodgems implements ITicketed and charge half price to children under 12 years old, 4.50

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
        }
        return defaultPrice() / 2;
    }

}
