import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    // ThemePark stores all Attractions and Stalls in it.

    private ArrayList<IReviewed> themeParkPOI;

    Visitor visitor;
    Attraction attraction;

    public ThemePark() {
        this.themeParkPOI = new ArrayList<IReviewed>();
    }

    // ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.

    public ArrayList<IReviewed> getAllReviewed() {
        return themeParkPOI;
    }

    // ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment
    // its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.

    public void visit(Visitor visitor, Attraction attraction) {

        int visitCount = attraction.getVisitCount();

        for (visitor:attraction) {
            visitCount++;
        }

        visitor.addAttractionToVisitedAttractions(attraction);
    }

}