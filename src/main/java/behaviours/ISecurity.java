package behaviours;

import people.Visitor;

public interface ISecurity {

    // ISecurity promises boolean isAllowedTo(Visitor)

    boolean isAllowedTo(Visitor visitor);

}
