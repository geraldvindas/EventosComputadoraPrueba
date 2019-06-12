import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class Memory {

    String message = "";
    Factory factory;
    EventManager eventManager;
    CPU cpu;


    Observable<String> values;
    Observable<String> values1 = Observable.empty();


    public Memory(Factory factory) {
        this.factory = factory;
        this.eventManager = this.factory.getEventManager();
        this.cpu = this.factory.getCPU();
    }

    public void getDato(){
        message = "Dato desde memoria";
        // values = Observable.just(message);
        values = Observable.just(message);
        // Creo evento
        this.eventManager.addEvent(new Event(2, "Busco dato", this.eventManager.totalTime + 3));
    }


}
