package HomeWork7.Person_and_Animal;

import HomeWork7.Person_and_Animal.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        }
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
