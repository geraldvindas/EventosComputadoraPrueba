public class Event implements Comparable<Event>{
    int eventTime;
    String eventName;
    int executionTime;

    public Event(int eventTime, String eventName, int executionTime) {
        this.eventTime = eventTime;
        this.eventName = eventName;
        this.executionTime = executionTime;
    }

    @Override
    public int compareTo(Event event) {
        return Integer.compare(this.eventTime, event.eventTime);
    }

    public void printEvent(){
        System.out.println("Evento: \t\t\t" + this.eventName);
        System.out.println("Tiempo del evento: \t" + this.eventTime);
        System.out.println("Tiempo ejecucion: \t" + this.executionTime);
    }
}
