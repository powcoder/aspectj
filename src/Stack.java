import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public abstract class Stack {

    protected List<String> lst = new ArrayList<>();


    public void push(String str) {

        lst.add(str);
    }

    public String pop() {

        if (isEmpty()) {

            return null;
        }


        String res = lst.get(lst.size() - 1);
        lst.remove(lst.size() - 1
        );

        return res;
    }


    public String top() {

        if (isEmpty()) {

            return null;
        }
        String res = lst.get(lst.size() - 1);

        return res;
    }

    protected boolean isEmpty(
    ) {

        return lst.isEmpty();
    }

    public int size() {

        return lst.size();
    }

    public static void main(String[] args) {

//        Stack myStack = new Stack();
//        myStack.push("base");
//        myStack.push("your");
//        myStack.push("all");
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.top());

    }
}
