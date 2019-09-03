package kea;

public class PaperTray {

    private int paper;


    public int displayPaper() {
        return paper;
    }

    public void usePaper()  {
        this.paper -= 1;

        if (this.paper == 0) {

        //System.exit(0);
            System.out.println("No more paper");
            load(100);
           displayPaper();
        }

    }
    void load(int paper) {
        this.paper = paper;
    }
}
