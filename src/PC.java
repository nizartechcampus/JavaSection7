public class PC {
    private Monitor monitor;
    private Motherboard motherboard;
    private Case theCase;

    public PC(Monitor monitor, Motherboard motherboard, Case theCase) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.theCase = theCase;
    }

    public void powerUp(){
        theCase.pressPowerButton();
    }
    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }
}
