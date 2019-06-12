import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableAny;

public class Event implements Comparable<Event>{
    int eventTime;
    String eventName;
    int executionTime;
    Observable observable;
    String value;

    public Event(int eventTime, String eventName, int executionTime, Observable observable, String value) {
        this.eventTime = eventTime;
        this.eventName = eventName;
        this.executionTime = executionTime;
        this.observable = observable;
        this.value = value;
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

    public void execute() {
        this.observable.just(value);
    }

}
