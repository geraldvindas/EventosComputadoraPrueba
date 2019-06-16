public class Main {

    public static void main( String []args){
        Factory factory = new Factory();
        EventManager eventManager = factory.getEventManager();
        CPU cpu = factory.getCPU();
        Cache cache = new Cache(factory);

        // Se pide un dato para crear los eventos
        cache.getData();
        // Se incrementa el reloj
        cpu.incrementClock();

        // eventManager.printEventList();

    }
}
