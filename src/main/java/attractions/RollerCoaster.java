package attractions;

// Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

// Rollercoaster implements ITicketed and charges tall people over 200cm double fee

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    Visitor visitor;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    // Rollercoaster implements ITicketed and charges tall people over 200cm double fee

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
        }
        return 16.80;
    }
}
