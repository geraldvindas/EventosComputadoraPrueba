public class Factory {
    // TODO make factory
    static EventManager eventManager = null;
    static CPU cpu = null;

    private static final Factory INSTANCE = new Factory();

    public static Factory getInstance() {
        return INSTANCE;
    }

    public EventManager getEventManager(){
        if (eventManager == null){
            eventManager = new EventManager();
        }
        return eventManager;
    }

    public CPU getCPU(){
        if ( cpu == null){
            cpu = new CPU();
        }
        return cpu;
    }
}
