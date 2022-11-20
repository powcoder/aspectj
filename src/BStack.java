
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BStack extends Stack {
    private int capacity;

    public BStack(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void push(String str) {
        if (!this.isFull())
            super.push(str);
    }

    private boolean isFull() {
        return lst.size() == capacity;
    }


    public static void main(String[] args) {


        BStack myStack = new BStack(2);
        myStack.push("base");
        myStack.push("your");
        myStack.push("all");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
    }
}