public aspect Logger2 {
    pointcut mutators(): call(void Stack.push(String)) ||
            call(String Stack.pop()); before(): mutators() {
        System.out.println(">Message sent to update stack."); }
}