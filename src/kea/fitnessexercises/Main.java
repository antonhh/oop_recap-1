package kea.fitnessexercises;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Member("Claus", 21212, true));
        personList.add(new Instructor("Anna", 34343));

        for (Person p : personList) {

            System.out.println(p.getName()); // instance of Person

            if (p instanceof Member){
                System.out.println(((Member)p).isBasic());
            } else if (p instanceof Instructor){
                System.out.println(( (Instructor) p).getHours());
            }
        }
    }
}
