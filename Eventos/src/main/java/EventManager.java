import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventManager {
    List<Event> events;
    int totalTime = 0;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void executeEvent(int actualTime){
        Event event = getEvent(actualTime);
        if (event != null ){
            System.out.println("\nSe ejecuta el evento tiempo = " + actualTime);
            event.printEvent();
            System.out.println("\n");
        }else {
            System.out.println("No hay evento para ejecutar en el tiempo " + actualTime);
        }
    }

    public void addEvent(Event event) {
        this.events.add(event);
        this.totalTime += event.eventTime;
        Collections.sort(this.events);
    }

    public void printEventList(){
        for (Event event : events) {
            event.printEvent();
        }
    }

    public Event getEvent( int actualTime){
        for (Event event: events) {
            if (event.executionTime == actualTime)
                return event;
        }
        return null;
    }


}
