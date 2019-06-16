import rx.Subscription;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Set;

public class Cache {

    ArrayList<Set<Block>> cache;

    int blockSize;
    int size;

    double readSpeed;
    double writeSpeed;
//    Bus bus;
//    EventManager eventManager;
//    Factory factory;
//    CPU cpu;
//
//    private Subscription subscription;
//
//    public Cache(Factory factory) {
//        this.factory = factory;
//        this.bus = new Bus(factory);
//        this.eventManager = this.factory.getEventManager();
//        this.cpu = this.factory.getCPU();
//    }
//
//    public void getData() {
//        // Creo evento
//        // this.eventManager.addEvent(new Event(2, "Pido a bus", this.eventManager.totalTime + 2));
//
//
//        bus.getDatoMem();
//
//    }


}
