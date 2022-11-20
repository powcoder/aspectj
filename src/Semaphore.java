
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Semaphore {
    private int value;

    public void increment() {

        System.out.println("increase");
        this.value++;
    }

    public void decrement() {
        this.value--;
    }

    public int getValue() {
        return this.value;
    }

    public void reset() {
        this.value = 0;
    }
}