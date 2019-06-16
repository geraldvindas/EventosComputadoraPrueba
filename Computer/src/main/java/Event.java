import rx.Observable;

public class Event implements Comparable<Event>{
    Class eventClass;
    int eventTime;
    int startTime;
    int executionTime;

    // TODO ver si es necesario la clase eventType ademas modificar el UML del evento
    EventType eventType;



    @Override
    public int compareTo(Event event) {
        return Integer.compare(this.eventTime, event.eventTime);
    }
//    int eventTime;
//    String eventName;
//    int executionTime;
//    Observable observable;
//    String value;
//
//    public Event(int eventTime, String eventName, int executionTime, Observable<String> observable, String value) {
//        this.eventTime = eventTime;
//        this.eventName = eventName;
//        this.executionTime = executionTime;
//        this.observable = observable;
//        this.value = value;
//    }
//
//    @Override
//    public int compareTo(Event event) {
//        return Integer.compare(this.eventTime, event.eventTime);
//    }
//
//    public void printEvent(){
//        System.out.println("Evento: \t\t\t" + this.eventName);
//        System.out.println("Tiempo del evento: \t" + this.eventTime);
//        System.out.println("Tiempo ejecucion: \t" + this.executionTime);
//    }
//
//    public void execute() {
//        RxBus.getInstance().post(this);
//    }

}
