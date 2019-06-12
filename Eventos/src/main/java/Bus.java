import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscription;

public class Bus {
    Memory memory;
    EventManager eventManager;
    Factory factory;
    CPU cpu;

    public Bus(Factory factory) {
        this.memory = new Memory(factory);
        this.factory = factory;
        this.eventManager = this.factory.getEventManager();
        this.cpu = this.factory.getCPU();
    }

    public void getDatoMem() {

        // Creo evento
        // this.eventManager.addEvent(new Event(2, "Pido a memoria", this.eventManager.totalTime + 2));
        this.memory.getDato();


        Disposable subscription = this.memory.values.subscribe(
                v -> System.out.println("Received in Bus: " + v),
                e -> System.out.println("Error: " + e),
                () -> System.out.println("Completed")
        );
    }

    public void prueba(){
        Disposable subscription = this.memory.values.subscribe(
                v -> System.out.println("Received in prueba: " + v),
                e -> System.out.println("Error: " + e),
                () -> System.out.println("Completed")
        );
    }
}
