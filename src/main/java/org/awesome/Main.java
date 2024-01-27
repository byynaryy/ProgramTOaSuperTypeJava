package org.awesome;

public class Main {
    public static void main(String[] args) {
        Animal animalCat = new Cat();
        animalCat.makeNoise();

        Animal animalDog = new Dog();
        animalDog.makeNoise();
    }
}