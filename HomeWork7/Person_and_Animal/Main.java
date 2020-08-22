package HomeWork7.Person_and_Animal;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> listPerson=new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {

            listPerson.add(new Person(RandomString.random(15),10000+(int)(Math.random()*10000)));
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);   // 1354-Скорость заполнения
//       System.out.println(listPerson);

        ArrayList<Person> listPersonSort=new ArrayList<>();
        listPersonSort.addAll(listPerson);
        PersonPasswordComparator passwordComparator=new PersonPasswordComparator();
        listPersonSort.sort(passwordComparator);
//       System.out.println(listPersonSort);


        System.out.println("_________________-");


        List<Animal> listAnimal=new ArrayList<>();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listAnimal.add(new Animal(RandomString.random(15),1+(int)(Math.random()*15)));
        }
        long stop2 = System.currentTimeMillis();
        System.out.println(stop2 - start2);   // 975-Скорость заполнения
//        System.out.println(listAnimal);

        ArrayList<Animal> listAnimalSort=new ArrayList<>();
        listAnimalSort.addAll(listAnimal);
        AnimalAgeComparator ageComparator=new AnimalAgeComparator();
        listAnimalSort.sort(ageComparator);
//        System.out.println(listAnimalSort);

        System.out.println("_________________-");

        Iterator<Person> PersonIterator=listPerson.iterator();
        while (PersonIterator.hasNext()){
            Person nextPerson=PersonIterator.next();
            PersonIterator.remove();
        }
        System.out.println(listPerson);


        for (int i = 0; i < listAnimalSort.size(); ) {
            listAnimalSort.remove(i);
        }
        System.out.println(listAnimalSort);

    }

}