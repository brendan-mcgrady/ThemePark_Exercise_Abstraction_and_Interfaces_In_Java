package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;

    // Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions

    private ArrayList<Attraction> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    // ...and a method to add an attraction to the list.

    public void addAttractionToVisitedAttractions(Attraction attraction) {
        visitedAttractions.add(attraction);
    }

    public int getSizeOfVisitedAttractions() {
        return visitedAttractions.size();
    }
}
