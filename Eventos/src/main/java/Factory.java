public class Factory {
    static EventManager eventManager = null;
    static CPU cpu = null;

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
