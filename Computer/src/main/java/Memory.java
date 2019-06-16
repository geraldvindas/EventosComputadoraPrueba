import rx.Observable;
import rx.subjects.BehaviorSubject;

import java.util.ArrayList;
import java.util.BitSet;

public class Memory {
    // FIXME change type
    ArrayList<BitSet> buffer;
    ArrayList<ArrayList<BitSet>> memory;

    int blockSize;
    int size;

    double readSpeed;
    double writeSpeed;


//    String message = "";
//    Factory factory;
//    EventManager eventManager;
//    CPU cpu;
//
//
//    BehaviorSubject<String> values2;
//    Observable<String> values = Observable.just("jola", "arroz", "torpe", "x");
//
//
//
//    public Memory(Factory factory) {
//        this.factory = factory;
//        this.eventManager = this.factory.getEventManager();
//        this.cpu = this.factory.getCPU();
//        this.values = Observable.just("hola");
//    }
//
//    public void getDato(){
//        message = "Dato desde memoria";
//        // values = Observable.just(message);
//        // values = Observable.just(message);
//        // Creo evento
//
//
//        this.eventManager.addEvent(new Event(2, "Busco dato", this.eventManager.totalTime + 3, values, message));
//        this.eventManager.addEvent(new Event(2, "Busco dato 2", this.eventManager.totalTime + 3, values, message));
//    }
//

}
