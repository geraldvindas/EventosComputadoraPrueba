import java.util.ArrayList;
import java.util.Set;

public class InstructionCache {
    ArrayList<Set<Block>> cache;

    int blockSize;
    int size;

    double readSpeed;
    double writeSpeed;
}
