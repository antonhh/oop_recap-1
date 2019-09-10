package kea.interfaces.CrudExercise;

public class Main {

    public static void main(String[] args) {
        ICrud repo = new FileRepository();

        repo.create(new Person("Claus"));
        System.out.println(repo.read());

    }
}
