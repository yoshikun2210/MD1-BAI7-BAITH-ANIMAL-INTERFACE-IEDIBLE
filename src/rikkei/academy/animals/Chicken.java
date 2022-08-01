package rikkei.academy.animals;

import rikkei.academy.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck!";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
