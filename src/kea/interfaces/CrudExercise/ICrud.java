package kea.interfaces.CrudExercise;

import java.util.List;

public interface ICrud {

    public void create(Person p);
    public List<Person> read();
    public void update(Person p);
    public void delete(Person p);



}
