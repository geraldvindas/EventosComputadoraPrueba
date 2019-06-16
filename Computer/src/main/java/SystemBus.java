import java.util.BitSet;

public class SystemBus {
    // FIXME change type
    BitSet lines;
    static final int DATA_INDEX = 0;
    static final int ADDRESS_INDEX = 0;
    static final int CONTROL_INDEX = 0;

    Memory memory;
    Cache cache;
}
