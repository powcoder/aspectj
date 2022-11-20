
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Counter {
    private int value;

    void increment() {
        this.value++;
    }

    public int getValue() {
        return value;
    }
}