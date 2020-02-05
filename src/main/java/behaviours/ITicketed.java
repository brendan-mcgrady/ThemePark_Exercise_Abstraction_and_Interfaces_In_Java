package behaviours;

import people.Visitor;

public interface ITicketed {

    // ITicketed promises double defaultPrice() and double priceFor(Visitor)

    double defaultPrice();
    double priceFor(Visitor visitor);

}


//        Have some of the classes implement these interfaces. Below are the rules about what the implementations should be:

//        Note: Starting prices are:
//        £8.40 for Rollercoaster
//        £4.50 for Dodgems
//        Rollercoaster implements ITicketed and charges tall people over 200cm double fee
//        Dodgems implements ITicketed and charge half price to children under 12 years old