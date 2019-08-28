package kea;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // Arv
        Machine m = new Machine();
        System.out.println(m);
        m.turnOn();
        System.out.println(m);
        m.turnOff();
        System.out.println(m);

        /*

        Printer p = new Printer();
        p.turnOn();
        p.print("Hej dat18b", 5);
        p.turnOff();

*/



        List<Machine> machines = new ArrayList<>();
        machines.add(new Printer());
        machines.add(new Radio());
        machines.add(new Machine());

        for (Machine ma: machines) {
            ma.turnOn();

            if (ma instanceof Printer){
                ((Printer) ma).print("Hej", 4);
            }

        }





    }
}
