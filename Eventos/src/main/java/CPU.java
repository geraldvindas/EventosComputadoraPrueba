public class CPU {
    int clock = 0;
    EventManager eventManager;
    Factory factory;
    static final int MAX_TIME = 20;

    public CPU() {
        this.factory = new Factory();
        this.eventManager = this.factory.getEventManager();
    }

    public void incrementClock(){
        for (int i = 0; i < MAX_TIME; i++) {
            this.eventManager.executeEvent(i);
        }
    }
}
