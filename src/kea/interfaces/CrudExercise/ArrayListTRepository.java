package kea.interfaces.CrudExercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTRepository implements ICrud {

    List<Person> personList = new ArrayList<>();


    public void create(Person p) {
        personList.add(p);
    }

    @Override
    public List<Person> read() {
        return personList;
    }

    @Override
    public void update(Person p) {

    }

    @Override
    public void delete(Person p) {

    }


}
