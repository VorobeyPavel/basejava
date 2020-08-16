package HomeWork7.Person_and_Animal;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getPassword()==o2.getPassword()){
            return 0;
        }
        if (o1.getPassword()>o2.getPassword()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
