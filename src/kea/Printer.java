package kea;

import kea.fitnessexercises.Person;

public class Printer extends Machine {

    private PaperTray paperTray; // composition

    public Printer(){
        paperTray = new PaperTray(); // composition
        paperTray.load(5);


    }

    public void print(String text, int amount){

        for (int i = 0; i < amount; i++){

            System.out.println(text);
            paperTray.usePaper();
            System.out.println(paperTray.displayPaper());

        }



    }
}
