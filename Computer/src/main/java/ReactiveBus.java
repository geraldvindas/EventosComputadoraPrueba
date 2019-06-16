
import rx.Subscription;
import rx.functions.Action1;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

public class ReactiveBus {

    private static final ReactiveBus INSTANCE = new ReactiveBus();

    private final Subject<Object, Object> mBusSubject = new SerializedSubject<>(PublishSubject.create());

    public static ReactiveBus getInstance() {
        return INSTANCE;
    }

    public <T> Subscription register(final Class<T> eventClass, Action1<T> onNext) {
        return mBusSubject
                .filter(event -> event.getClass().equals(eventClass))
                .map(obj -> (T) obj)
                .subscribe(onNext);
    }

    public void post(Object event) {
        mBusSubject.onNext(event);
    }
}
