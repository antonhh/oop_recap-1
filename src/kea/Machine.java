package kea;
public class Machine  {
    // Super klassen

    // field el. data
    private boolean isOn;

    // getter & setters

    public void turnOn() {
        // tænder for maskinen
        this.isOn = true;
    }

    public void turnOff(){
        // slukker for maskinen
        this.isOn = false;
        System.exit(0);
    }

    @Override
    public String toString() {
        if (this.isOn){
            return "Machine is on";
        } else {
            return "Machine is off";
        }
    }
}
