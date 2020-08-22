package HomeWork7.Person_and_Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Person> listPerson=new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            listPerson.add(new Person(RandomString.random(15),10000+(int)(Math.random()*10000)));
        }

        long start = System.currentTimeMillis();
        Iterator<Person> PersonIterator=listPerson.iterator();
        while (PersonIterator.hasNext()){
            Person nextPerson=PersonIterator.next();
            PersonIterator.remove();
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);          //69-скорость удаления
        System.out.println(listPerson);


        List<Animal> listAnimal=new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            listAnimal.add(new Animal(RandomString.random(15),1+(int)(Math.random()*15)));
        }

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < listAnimal.size(); ) {
            listAnimal.remove((int)i);
        }
        long stop2 = System.currentTimeMillis();
        System.out.println(stop2 - start2);         //276277-скорость удаления
        System.out.println(listAnimal);


    }
}
